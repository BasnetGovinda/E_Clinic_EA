<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Patient </title>
</head>
<body>

<div style="padding-left: 400px; padding-top:130pt; font: menu;">
<h1> Patients Registration Form </h1>

<table>
	<form:form modelAttribute="patientForm"
		action="${pageContext.request.contextPath}/patient/add" method="POST">
		
		<tr> <td> <label>Username</label></td>
		<td><input name="un" /> </td></tr>
		
		
		<tr> <td> <label>Password</label></td>
		<td><input type="password" name="pw" /></td></tr>
		
		<tr> <td> <label>First Name</label></td>
		<td><form:input path="firstName" /> </td></tr>
		<tr></tr>
		<br/>
		
		<tr> <td> <label>Last Name</label></td>
		<td><form:input path="lastName" /></td></tr>
		
		
		<tr> <td> <label>Date of Birth</label></td>
		<td><form:input type="date" path="tempdate" /> </td></tr>
		
		<tr> 
		<td> <label>E-mail</label></td>
		<td><form:input path="email" /></td>
		</tr>
		
		<tr> <td> <label>Blood Group</label></td>
		<td><form:input path="bloodType" /></td></tr>
		
		<tr> <td> <label>Phone Number </label></td>
		<td><form:input path="phoneNo" /></td></tr>
		
		<tr> <td> <label>Weight</label></td>
		<td><form:input path="weight" /></td></tr>
		
		<tr> <td> <label>height</label></td>
		<td><form:input path="height" /></td></tr>

		<tr> <td> <button type="submit">Add Patient</button></td>
		</tr>

	</form:form>
</table>
</div>
</body>
</html>