package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Student st1 = context.getBean("stud1", Student.class);
		Student st2 = context.getBean("stud2", Student.class);
		
		System.out.println(st1);
		System.out.println(st2);

	}

}
