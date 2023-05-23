package ncu.SpringEmployeeJDBC.Service;

import java.util.List;

import ncu.SpringEmployeeJDBC.entity.Employee;

public interface EmployeeService {
	public String createRecord(Employee e);
	public int updateRecord(Employee e, int empId);
	public int deleteRecord(int empId);
	public Employee fetchEmployee(int empId);
	public List<Employee> loadEmployees();
	public void batchInsertRecord(List<Employee> emps);
}
