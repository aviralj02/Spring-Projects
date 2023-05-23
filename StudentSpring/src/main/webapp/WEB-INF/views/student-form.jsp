<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Form</title>
<style>
	.error{
		color: red;
	}
</style>
</head>
<body>
	<h1>Fill the following details:</h1>
	<hr>
	<br>
	<form:form action="display" method="post" modelAttribute="student">

		<label for="name">Name</label>
		<form:input type="text" path="name" />
		<form:errors path="name" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="password">Password</label>
		<form:input type="password" path="password" />
		<form:errors path="password" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="cpass">Confirm Password</label>
		<form:input type="password" path="cpass" />
		<br>
		<br>
		<label for="mail">Mail ID</label>
		<form:input type="text" path="mail" />
		<form:errors path="mail" cssClass="error"></form:errors>
		<br>
		<br>
		
		<label>Date</label>
		<form:input type="date" path="date" />
		<form:errors path="date" cssClass="error" ></form:errors>
		<br>
		<br>
		
		<label>Gender: </label>
		Male<form:radiobutton path="gender" value="Male" />  
        Female<form:radiobutton path="gender" value="Female" />
		<br>
		<br>
		<label>Courses</label>
		<br>
		<form:checkboxes items="${ student.courseOptions }" path="courses" />
		<br>
		<br>

		<label>Tutor:</label>
		<br>
		<form:select path="tutor">
			<form:options items="${ student.tutorOptions }" />
		</form:select>
		<br>
		<br>

		<input type="submit" value="Submit" />
		<input type="reset" value="Clear" />
	</form:form>
</body>
</html>