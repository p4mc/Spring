package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Student stud1 = (Student)context.getBean("stud1");
		stud1.sayHello();
		
		Student stud2 = context.getBean("stud2",Student.class);
		stud2.sayHello();

	}

}
