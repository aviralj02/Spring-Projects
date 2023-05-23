<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
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
		<h2>Record Updated Successfully!</h2>
		<a href="/SpringEmployeeJDBC/">Go to Home</a>
	</div>
</body>
</html>