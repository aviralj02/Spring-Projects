<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aadhar Registration Form</title>
<style>
	.error{
		color: red;
	}
</style>
</head>
<body>
	<h2>Aadhar Verification Registration Form</h2>

	<hr>
	<br>
	<form:form action="display" method="post" modelAttribute="user">

		<label for="name">User Name</label>
		<form:input type="text" path="name" />
		<form:errors path="name" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="pass">Password</label>
		<form:input type="pass" path="pass" />
		<form:errors path="pass" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="id">Aadhar ID</label>
		<form:input type="text" path="AID" />
		<form:errors path="AID" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="mail">E-Mail</label>
		<form:input type="text" path="mail" />
		<form:errors path="mail" cssClass="error"></form:errors>
		<br>
		<br>
		<label>Phone Number</label>
		<form:input text="text" path="number"/>
		<form:errors path="number" cssClass="error"></form:errors>
		<br>
		<br>
		<label>DOB</label>
		<form:input type="date" path="DOB"/> 
		<form:errors path="DOB" cssClass="error"></form:errors>
		<br>
		<br>
		<label>Enter State:</label>
		<form:select path="state">
			<form:options items="${ user.stateOptions }"/>
		</form:select>
		<form:errors path="state" cssClass="error"></form:errors>
		<br>
		<br>
		<br>
		<label>Gender: </label>
		Male<form:radiobutton path="gender" value="Male" />  
        Female<form:radiobutton path="gender" value="Female" />
        <form:errors path="gender" cssClass="error"></form:errors>
		<br>
		<br>
		<label>Other Verification Options: </label>
		<form:checkboxes items="${ user.otherOptions }" path="others" />
		<form:errors path="others" cssClass="error"></form:errors>
		<br>
		<br>

		<label>Address Details</label>
		<br>
		<form:textarea path="address" rows="5" cols="30" />
		<form:errors path="address" cssClass="error"></form:errors>
		<br>
		<br>

		<input type="submit" value="Submit" />
		<input type="reset" value="clear" />
	</form:form>
</body>
</html>