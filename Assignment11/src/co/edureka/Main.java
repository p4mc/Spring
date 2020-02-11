package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		EmployeeDAO dao = (EmployeeDAO)context.getBean("empdao");
		
		Employee emp2 = new Employee(102, "Laya Papaya",50000, 1000, 2000, 1500 );
		dao.saveEmp(emp2);
		
		/*
		Employee emp3 = new Employee(103, "John Marquee",50000, 1000, 2000, 1500 );
		dao.saveEmp(emp3);
		Employee emp4 = new Employee(105, "John Marquee",50000, 1000, 2000, 1500 );
		dao.saveEmp(emp4);
		Employee emp5 = new Employee(106, "John Marquee",50000, 1000, 2000, 1500 );
		dao.saveEmp(emp5);
		Employee emp6 = new Employee(107, "John Marquee",50000, 1000, 2000, 1500 );
		dao.saveEmp(emp6);
		Employee emp7 = new Employee(108, "John Marquee",50000, 1000, 2000, 1500 );
		dao.saveEmp(emp7);
		Employee emp8 = new Employee(109, "John Marquee",50000, 1000, 2000, 1500 );
		dao.saveEmp(emp8);
		Employee emp9 = new Employee(110, "John Marquee",50000, 1000, 2000, 1500 );
		dao.saveEmp(emp9);
		*/
		List<Employee> emps = dao.getEmployees();
		for(Employee e : emps) {
			System.out.println(e);

	}

}

}