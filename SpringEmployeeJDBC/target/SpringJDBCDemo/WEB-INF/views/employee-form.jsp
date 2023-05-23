<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Review App</title>
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
		<h2>Employee Input Form</h2>
		<br>
		<hr>

		<form:form action="processForm" method="post" modelAttribute="employee">

			<label for="id">Employee ID</label>
			<form:input type="text" path="empId" />
			<br>
			<br>

			<label for="name">Employee Name</label>
			<form:input type="text" path="empName" />
			<br>
			<br>

			<label for="salary">Employee Salary</label>
			<form:input type="text" path="empSalary" />
			<br>
			<br>

			<label for="address">Employee Address</label>
			<br>
			<form:textarea path="empAddress" rows="5" cols="30" />
			<br>
			<br>

			<input type="submit" value="submit" />

		</form:form>
		<hr>
	</div>
</body>
</html>