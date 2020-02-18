package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		EmployeeDAO dao = (EmployeeDAO)context.getBean("empdao");

		Employee emp1 = new Employee(101, "John Marquee",50000, 1000, 2000, 1500 );
		dao.saveEmployee(emp1);
		
	
		List<Employee> emp2 = dao.getEmployee("John Marquee");
		for(Employee semp : emp2) {
			System.out.println(semp);
			String name = semp.getEname();
			int basic = semp.getBasic();
			int hra = semp.getHra();
			int da = semp.getDa();
			int gross_salary = basic + hra + da;
			
			int deductions = semp.getDeduction();
			
			float tax_deductions = deductions + (float)0.15*basic;
			
			float net_salary = gross_salary - tax_deductions;
			
			System.out.println("Name: "+name+" - "+net_salary);
			
			/* RESULT AFTER RUNNING THE CODE
			Hibernate: select employee0_.empno as empno1_0_, employee0_.ename as ename2_0_, employee0_.basic as basic3_0_, employee0_.hra as hra4_0_, employee0_.da as da5_0_, employee0_.deduction as deductio6_0_ from emp1 employee0_ where employee0_.ename='John Marquee'
			Employee [empno=101, ename=John Marquee, basic=50000, hra=1000, da=2000, deduction=1500]
			Name: John Marquee - 44000.0
			 */
			
		}

	}

}
