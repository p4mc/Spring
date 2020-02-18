package com.edureka;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDAO {
	HibernateTemplate template;
	SessionFactory factory1;

	public void setSessionFactory(SessionFactory factory) {
		template=new HibernateTemplate(factory);
		factory1 = factory;
	}

	public void saveEmployee(Employee e){
		template.save(e);
	}
	
	public List<Employee> getEmployee (String ename)
	{	 
	 
	String query = "FROM emp1 WHERE ename = '"+ename+"'";
	Session session = factory1.openSession();
	
	List<Employee> emplst = session.createQuery(query).list();
	return emplst;
	
	
	
	}

}

