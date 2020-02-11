package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Bank bank = context.getBean("proxy", Bank.class);
		bank.deposit();
		bank.deposit("SBIN0001", 25000.5);

	}

}
