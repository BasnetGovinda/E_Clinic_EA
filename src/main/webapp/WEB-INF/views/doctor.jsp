<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Appointments</h1>
	<a href="schedule">Create Schedule</a>
	<a href="showSchedule">Show Schedule</a>
	<table>
	<c:forEach var="doc" items="${doctors}">
	<tr>
		<td>${doc.firstName}</td>
		<td>${doc.lastName}</td>
		<td>${doc.email}</td>
		<td>${doc.sepcialization}</td>
		<td><a href="doctor/${doc.id}">edit</a></td>
	</tr>
	</c:forEach>
	</table>
	
	
</body>
</html>