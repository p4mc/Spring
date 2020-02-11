package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		EmployeeDAO dao = (EmployeeDAO)context.getBean("empdao");

		//Employee emp2 = new Employee(103, "Sandra Papo",100000, 5000, 4000, 2000 );
		//dao.saveEmployee(emp2);
		
		
		//List<Employee> emplst = dao.getEmployees("John Marquee");
		//System.out.println(emplst);
		
		//Employee emp1 =(Employee)dao.getByEname(101);
		Employee emp1 =(Employee)dao.getByEmpno(101);
		System.out.println(emp1);
		
		List<Employee> emps = dao.getEmployees();
		
		for(Employee semp : emps) {
			
	
			
			String name = semp.getEname();
			int basic = semp.getBasic();
			int hra = semp.getHra();
			int da = semp.getDa();
			int gross_salary = basic + hra + da;
			//System.out.println("Gross salary "+gross_salary);
			
			int deductions = semp.getDeduction();
			
			float tax_deductions = deductions + (float)0.15*basic;
			//System.out.println("Deductions "+total_deductions);
			
			float net_salary = gross_salary - tax_deductions;
			//System.out.println("Final salary is "+total_sal);	
			
			System.out.println("Name: "+name+" - "+net_salary);
		
		}

	}

}
