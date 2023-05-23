package ncu.SpringEmployeeJDBC.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import ncu.SpringEmployeeJDBC.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public int insertEmployee(Employee e) {
		String query = "insert into employee values(?,?,?,?);";
		Object[] arr = { e.getEmployee_id(), e.getEmployee_name(), e.getEmployee_salary(), e.getEmployee_address() };

		int result = jdbc.update(query, arr);

		return result;
	}

	@Override
	public int updateEmployee(Employee e, int empId) {
		String sql = "update employee set employee_name=?, employee_sal=?, employee_address=? where employee_id=?;";
		Object[] arr = { e.getEmployee_name(), e.getEmployee_salary(), e.getEmployee_address(), empId };

		int result = jdbc.update(sql, arr);

		return result;
	}

	@Override
	public int deleteEmployee(int empId) {
		String sql = "delete from employee where employee_id=?;";
		int result = jdbc.update(sql, empId);
		return result;
	}

	@Override
	public Employee getEmployee(int empId) {
		String query = "select * from employee where employee_id=" + empId + ";";
		Employee emp = jdbc.query(query, new ResultSetExtractor<Employee>() {

			@Override
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Employee e = new Employee();
					e.setEmployee_id(rs.getInt("employee_id"));
					e.setEmployee_name(rs.getString("employee_name"));
					e.setEmployee_salary(rs.getInt("employee_sal"));
					e.setEmployee_address(rs.getString("employee_address"));

					return e;
				}
				return null;
			}

		});
		return emp;
	}

	@Override
	public List<Employee> getEmployeeRecords() {
		String sql = "SELECT * FROM employee order by employee_address;";
		List<Employee> el = jdbc.query(sql, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int n) throws SQLException {
				Employee emp = new Employee();
				emp.setEmployee_id(rs.getInt("employee_id"));
				emp.setEmployee_name(rs.getString("employee_name"));
				emp.setEmployee_salary(rs.getInt("employee_sal"));
				emp.setEmployee_address(rs.getString("employee_address"));

				return emp;
			}
		});

		return el;
	}

	@Override
	public int[] saveBatch(List<Employee> empList) {
		String query = "insert into employee_backup values(?, ?, ?, ?)";

		int[] records = jdbc.batchUpdate(query, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setInt(1, empList.get(i).getEmployee_id());
				ps.setString(2, empList.get(i).getEmployee_name());
				ps.setDouble(3, empList.get(i).getEmployee_salary());
				ps.setString(4, empList.get(i).getEmployee_address());
			}

			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return empList.size();
			}
		});
		
		return records;
	}

}
