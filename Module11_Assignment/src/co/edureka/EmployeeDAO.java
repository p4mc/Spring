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


	
	public List<Employee> getEmployees (String ename)
	{	 
	 
	String query = "FROM emp1 WHERE ename = '"+ename+"'";
	Session session = factory1.openSession();
	
	List<Employee> emplst = session.createQuery(query).list();
	return emplst;
	}

	
	@Transactional(readOnly = false)
	public void saveEmployee(Employee emp) {
	template.save(emp);
	}
	
	@Transactional(readOnly = false)
	public void updateEmployee(Employee emp) {
	template.update(emp);
	}
	
	@Transactional(readOnly = false)
	public void deleteEmployee(Employee emp) {
	template.delete(emp);
	}
	
	public Employee getByEmpno(int empno) {
		Employee emp = (Employee)template.get(Employee.class, empno);
		return emp;
	}
	
	
	
	public Employee getByEname(String name) {
		Employee emp = (Employee)template.load(Employee.class, name);
		return emp;
	}
	
	
	public List<Employee> getEmployees(){
		List<Employee> list = new ArrayList<Employee>();
		list = template.loadAll(Employee.class);
		return list;
		
	}
	


}
