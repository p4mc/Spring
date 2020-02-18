package co.edureka;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDAO {
	
	private HibernateTemplate template;
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	

	SessionFactory factory1;

	public void setSessionFactory(SessionFactory factory) {
		template=new HibernateTemplate(factory);
		factory1 = factory;
	}

	public void saveEmployee(Employee e){
		template.save(e);
	}
	
	public List<Employee> getEmployee (String name)
	{	 
	 
	String query = "FROM Employee2 WHERE name = '"+name+"'";
	Session session = factory1.openSession();
	
	List<Employee> emplst = session.createQuery(query).list();
	return emplst;
	}

}
