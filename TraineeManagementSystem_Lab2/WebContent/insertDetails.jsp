<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Trainee Details</h1>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<f:form action="insert.obj" modelAttribute="tr">
		Trainee id:
		<f:input path="traineeId" />
		<f:errors cssStyle="color:red" path="traineeId" />
		<br />
		Trainee Name:
		<f:input path="traineeName" />
		<f:errors cssStyle="color:red" path="traineeName" />
		<br />
		Trainee Location:
		<f:radiobutton  path="traineeLocation" value="Chennai" />Chennai
		<f:radiobutton  path="traineeLocation" value="Banglore" />Banglore
		<f:radiobutton  path="traineeLocation" value="Pune" />Pune
		<f:radiobutton  path="traineeLocation" value="Mumbai" />Mumbai
		<br />
		Trainee Domain:
		<f:select path="traineeDomain">
		<option value="JEE">JEE</option>
		<option value=".Net">.Net</option>
		<option value="Mainframe">Mainframe</option>
		<option value="BI">BI</option>
		</f:select>
		<br />
		<input type="submit" value="Add Trainee" />
</f:form>
</body>
</html>