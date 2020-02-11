import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main 
{
	public static void main(String[] args) 
	{
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

		Student st1 = (Student)factory.getBean("stud1");
		st1.sayHello();

		Student st2 = factory.getBean("stud2",Student.class);
		st2.sayHello();

		Student st3 = (Student)factory.getBean("stud1");
		st3.sayHello();

		Student st4 = (Student)factory.getBean("stud1");
		st4.sayHello();
	}
}
