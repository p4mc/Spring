package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		MobilePhoneDAO dao = (MobilePhoneDAO)context.getBean("empdao");
		
		
		//Add an Android
		MobilePhone mob = new MobilePhone(101, "Samsung", "Galaxy", 999.5f, "blue");
		dao.saveMob(mob);
		
		//Add an iPhone
		MobilePhone mob1 = new MobilePhone(102, "Apple", "iPhone XR", 999.5f, "gold");
		dao.saveMob(mob1);
		
		
		//Update existing record
		MobilePhone mob2 = new MobilePhone(101, "Samsung", "Galaxy Note 10", 999.5f, "blue");
		dao.updateMob(mob2);
		
		//Delete a record
		dao.deleteMob(102);
		
		//List all records
		List<MobilePhone> mobs = dao.getMobilePhones();
			for(MobilePhone mob3 : mobs) {
				System.out.println(mob3);
			}
			
	}

}


/* Result 

>>>MobilePhone Saved!
>>>MobilePhone Saved!
>>>MobilePhone Updated!
>>>MobilePhone Deleted!
MobilePhone [101, | Samsung, | Galaxy Note 10, | 999.5, | blue]
  
 */
