package ncu.SpringEmployeeJDBC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ncu.SpringEmployeeJDBC.DAO.EmployeeDAO;
import ncu.SpringEmployeeJDBC.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO empDao;

	@Override
	public String createRecord(Employee e) {
		int result = empDao.insertEmployee(e);
		if (result == 0) {
			return "Error saving record!";
		} else {
			return "Record inserted successfully!";
		}
	}

	@Override
	public int updateRecord(Employee e, int empId) {
		int result = empDao.updateEmployee(e, empId);

		return result;
	}

	@Override
	public int deleteRecord(int empId) {
		int result = empDao.deleteEmployee(empId);

		return result;
	}

	@Override
	public Employee fetchEmployee(int empId) {
		Employee employee = empDao.getEmployee(empId);
		if (employee != null) {
			return employee;
		} else {
			return null;	
		}
	}

	@Override
	public List<Employee> loadEmployees() {
		List<Employee> employeeList = empDao.getEmployeeRecords();
		if (employeeList != null) {
			return employeeList;
		} else {
			return null;
		}
	}

	@Override
	public void batchInsertRecord(List<Employee> emps) {
		int[] records = empDao.saveBatch(emps);
		if (records != null) {
			System.out.println("Batch operation success!!");
		} else {
			System.out.println("Error inserting batch records!!");
		}
	}

}
