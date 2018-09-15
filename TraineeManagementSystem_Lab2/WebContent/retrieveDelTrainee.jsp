<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Trainee Info</h1>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<table border="1">
	<tr>
	<th>Trainee ID</th>
	<th>Trainee Name</th>
	<th>Trainee Location</th>
	<th>Trainee Domain</th>
	</tr>
	<tr>
	<td>${tr.traineeId}</td>
	<td>${tr.traineeName}</td>
	<td>${tr.traineeLocation}</td>
	<td>${tr.traineeDomain}</td>
	</tr>		
</table>
</body>
</html>