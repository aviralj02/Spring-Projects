package ncu.SpringEmployeeJDBC.DAO;

import java.util.List;

import ncu.SpringEmployeeJDBC.entity.Employee;

public interface EmployeeDAO {
	public int insertEmployee(Employee e);
	public int updateEmployee(Employee e, int empId);
	public int deleteEmployee(int empId);
	public Employee getEmployee(int empId);
	public List<Employee> getEmployeeRecords();
	public int[] saveBatch(List<Employee> empList);
}
