package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		EmployeeDAO dao = (EmployeeDAO)context.getBean("empdao");
		
		Employee emp = new Employee(105, "Laya", 12345.5f);
		dao.saveEmp(emp);
		
		List<Employee> emps = dao.getEmployees();
		for(Employee e : emps) {
			System.out.println(e);
		}

	}

}
