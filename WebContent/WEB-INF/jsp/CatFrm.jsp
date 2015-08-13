<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department List</title>
</head>
<body>
	<h1>View Employee By Dept</h1>
	<hr />
	<form:form action="dept.htm" commandName="employee">
		<form:select path="dept" items="${dlist}" />
		<input type="submit" value="search"/>
	</form:form>
</body>
</html>