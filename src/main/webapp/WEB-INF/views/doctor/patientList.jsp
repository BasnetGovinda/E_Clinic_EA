<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> List Doctors </title>



</head>
<body>

<h2> Please Select the Doctor to make appointment</h2>
	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Date of Birth</th>
				<th>Email</th>
				<th>Specialization</th>
			</tr>
		</thead>

		<c:forEach var="doctor" items="${doctor}">
			<tr>
				<td><a href="">${doctor.firstName}</a></td>
				<td>${doctor.lastName}</td>
				<td>${doctor.dateOfBirth}</td>
				<td>${doctor.email}</td>
				<td>${doctor.sepcialization}</td>

			</tr>
		</c:forEach>
	</table>

<a href="/E_Clinic_EA/j_spring_security_logout">logout</a>
</body>
</html>