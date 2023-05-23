<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
<style>
div {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 90vh;
	flex-direction: column;
}

.error {
	color: red;
}
</style>
</head>
<body>
	<div>
		<h2>Update Employee Details</h2>
		<br>
		<hr>

		<form:form action="processUpdate" method="post" modelAttribute="emp">

			<label for="id">Employee ID</label>
			<form:input type="text" path="employee_id" readonly="true" />
			<br>
			<br>
			
			<label for="name">Employee Name</label>
			<form:input type="text" path="employee_name" />
			<br>
			<br>

			<label for="salary">Employee Salary</label>
			<form:input type="text" path="employee_salary" />
			<br>
			<br>

			<label for="address">Employee Address</label>
			<br>
			<form:textarea path="employee_address" rows="5" cols="30" />
			<br>
			<br>

			<input type="submit" value="Update" />

		</form:form>
		<hr>
	</div>
</body>
</html>