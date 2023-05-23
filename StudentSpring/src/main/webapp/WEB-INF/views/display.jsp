<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details</title>
    </head>
    <body>
        <h1>Student Registration Form Details</h1>
        <p>Name: ${ student.name }</p>
        <p>Password: ${ student.password }</p>
        <p>Mail: ${ student.mail }</p>
        <p>Gender: ${ student.gender }</p>
        <p>Tutor: ${ student.tutor }</p>
        <p>Courses: ${ student.courses }</p>
    </body>
</html>