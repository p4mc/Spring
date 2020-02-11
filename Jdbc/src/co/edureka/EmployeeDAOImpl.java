package co.edureka;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	 private JdbcTemplate jt;

	 public JdbcTemplate getJt() {
	  return jt;
	 }

	 public void setJt(JdbcTemplate jt) {
	  this.jt = jt;
	 }
	
	@Override
	public void saveEmp(Employee emp1) {
		String sql = "insert into emp values("+emp1.getEmpno()+",'"+emp1.getEname()+"',"+emp1.getSal()+")";
		int n = jt.update(sql);
		if(n>0)
			System.out.println(">>>Employee Saved!");

	}

	@Override
	public void updateEmp(Employee emp1){
		String sql = "update emp set ename='"+emp1.getEname()+"',sal="+emp1.getSal()+" where empno="+emp1.getEmpno();
		int n = jt.update(sql);
		if(n>0)
			System.out.println(">>>Employee Updated!");

	}

	@Override
	public void deleteEmp(int eno){
		String sql = "delete from emp where empno="+eno;
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
					e.setSal(rs.getFloat(3));
					list.add(e);
				}
				return list;
			}
		});
		return l;

	}

}
