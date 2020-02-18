package com.edureka;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
public class EmpsMapper implements RowMapper<Employee> {
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setBasic(rs.getInt("basic"));
		emp.setDa(rs.getInt("da"));
		emp.setDeductions(rs.getInt("deductions"));
		emp.setHra(rs.getInt("hra"));
		emp.setEmpno(rs.getInt("empno"));
		emp.setEname(rs.getString("ename"));
 
 
		
		
		
		return emp;
	}  
}