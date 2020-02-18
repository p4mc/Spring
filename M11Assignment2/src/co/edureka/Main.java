package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		EmployeeDAO dao = (EmployeeDAO)context.getBean("empdao");

		//Employee emp2 = new Employee(105, "daddio Papo",75000, 15000, 18000, 5000 );
		//dao.saveEmployee(emp2);
		
		Employee e=new Employee();
		e.setEmpno(105);
		e.setBasic(1000);
		e.setDa(500);
		e.setDeduction(200);
		e.setHra(1500);
		e.setEname("John");
	 
		
		dao.saveEmployee(e);
		System.out.println("Record inserted...");
		
		List <Employee> empLst = dao.getEmployee("John");
		
		
		for (Employee emp : empLst)
		{
			 
			
			int basic = emp.getBasic();
			int hra = emp.getHra();
			int da = emp.getDa();
			int gross_salary = basic + hra + da;
			System.out.println("Gross salary "+gross_salary);
			
			int deductions = emp.getDeduction();
			
			float total_deductions = deductions + (float)0.15*basic;
			System.out.println("Deductions "+total_deductions);
			
			float total_sal = gross_salary - total_deductions;
			System.out.println("Final salary is "+total_sal);		
		}


		
	}
}
