package co.edureka;

import java.util.List;

public interface EmployeeDAO {
	
	void saveEmp(Employee emp);
	void updateEmp(Employee emp);
	void deleteEmp(int eno);
	List<Employee> getEmployees();

}
