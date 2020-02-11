package co.edureka;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


public class EmployeeDAOImpl implements EmployeeDAO {
	
	
	private JdbcTemplate jt;

	 public JdbcTemplate getJt() {
	  return jt;
	 }

	 public void setJt(JdbcTemplate jt) {
	  this.jt = jt;
	 }
	
	

	
	@Override
	public void saveEmp(Employee emp) {
		String sql = "insert into emp1 values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getBasic()+",'"+emp.getHra()+"', '"+emp.getDa()+"', '"+emp.getDeduction()+"')";
		int n = jt.update(sql);
		if(n>0)
			System.out.println(">>>Employee Saved!");
	

	}

	@Override
	public void updateEmp(Employee emp){
		String sql = "update emp1 set ename='"+emp.getEname()+"',basic="+emp.getBasic()+"',hra='"+emp.getHra()+"',da="+emp.getDa()+"',deduction='"+emp.getDeduction()+" where empno="+emp.getEmpno();
		int n = jt.update(sql);
		if(n>0)
			System.out.println(">>>Employee Updated!");

	}

	@Override
	public void deleteEmp(int eno){
		String sql = "delete from emp1 where empno="+eno;
		int n = jt.update(sql);
		if(n>0)
			System.out.println(">>>Employee Deleted!");
		else
			System.out.println(">>>No matching employee for deletion");

	}


	@Override
	public List<Employee> getEmployees(){
		String sql="select * from emp1";
		
		List<co.edureka.Employee> l = jt.query(sql, new ResultSetExtractor<java.util.List<Employee>>(){
			public List<Employee> extractData(ResultSet rs) throws SQLException,DataAccessException{
				List<Employee> list = new ArrayList<Employee>();
				while(rs.next()) {
					Employee e = new Employee();
					e.setEmpno(rs.getInt(1));
					e.setEname(rs.getString(2));
					e.setBasic(rs.getInt(3));
					e.setHra(rs.getInt(4));
					e.setDa(rs.getInt(5));
					e.setDeduction(rs.getInt(6));
					list.add(e);
				}
				return list;
			}
		});
		return l;

	}

}
