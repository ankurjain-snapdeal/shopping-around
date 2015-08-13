<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmpView</title>
</head>
<body>
<h1>Employee Details</h1>
<hr/>
<table cellpadding="10" bgcolor="#e7e7e7">
	<tr>
		<td>Emp Id</td>
		<td>Emp Name</td>
		<td>Salary</td>
		<td>DOJ</td>
		<td>Dept</td>
	</tr>
	<c:forEach items="${elist }" var="e">
		<tr>
		<td>${e.empId }</td>
		<td>${e.empName }</td>
		<td>${e.empSal }</td>
		<%-- <td><fmt:formatDate value="${e.doj }" pattern="dd-MMM-yyyy"/></td> --%>
		<td>${e.dept }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>