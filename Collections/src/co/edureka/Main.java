package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Databases db = context.getBean("db", Databases.class);
		List<String> dbNames = db.getDbNames();
		System.out.println(dbNames);

	}

}
