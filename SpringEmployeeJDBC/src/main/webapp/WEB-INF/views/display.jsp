<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
}

table {
	width: 100%;
}
</style>
</head>
<body>
	<h1 align="center">Employee Dashboard</h1>
	<br>
	<div>
		<table>
			<thead>
				<tr>
					<th>Employee Id</th>
					<th>Employee Name</th>
					<th>Employee Salary</th>
					<th>Employee Address</th>
					<th>Operation</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="employee" items="${employees}">
					<tr>
						<td>${employee.getEmployee_id() }</td>
						<td>${employee.getEmployee_name() }</td>
						<td>${employee.getEmployee_salary() }</td>
						<td>${employee.getEmployee_address() }</td>
						<td><a href="updateForm?empId=${employee.getEmployee_id()}">Edit</a>

							<a href="deleteRecord?empId=${employee.getEmployee_id()}"
							onclick="if (!(confirm('Do you really want to delete this employee record?'))) return false">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br><br>
		<form:form action="batchProcess" method="POST">
			<input type="submit" value="Save all" />
		</form:form>
	</div>
</body>
</html>