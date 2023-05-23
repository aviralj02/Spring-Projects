package ncu.SpringEmployeeJDBC.entity;

public class Employee {
	private int employee_id;
	private String employee_name;
	private long employee_salary;
	private String employee_address;
	
	public Employee() {}
	
	public Employee(int employee_id, String employee_name, long employee_salary, String employee_address) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
		this.employee_address = employee_address;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public long getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(long employee_salary) {
		this.employee_salary = employee_salary;
	}
	public String getEmployee_address() {
		return employee_address;
	}
	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_salary="
				+ employee_salary + ", employee_address=" + employee_address + "]";
	}
	
	
}
