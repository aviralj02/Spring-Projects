<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
table, th, td{
	border: 1px solid black;
}
table{
	width: 100%;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aadhaar Information</title>
</head>
<body>
	<h1>Aadhaar Registration Form Details</h1>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Password</th>
				<th>Gender</th>
				<th>AID</th>
				<th>E-Mail</th>
				<th>M.Number</th>
				<th>DOB</th>
				<th>State</th>
				<th>Other Options</th>
				<th>Address</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${user.name}</td>
				<td>${user.pass}</td>
				<td>${user.gender}</td>
				<td>${user.AID}</td>
				<td>${user.mail}</td>
				<td>${user.number}</td>
				<td>${user.DOB}</td>
				<td>${user.state}</td>
				<td>${user.otherOptions}</td>
				<td>${user.address}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>