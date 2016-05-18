<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> List Patients </title>
<script>
	function confirmDelete(url) {
		if (confirm("Are you sure you want to delete this?")) {
			window.open(url);
		} else {
			false;
		}
	}
</script>
</head>
<body>

		<div style="margin-left: 100px; margin-top:50pt; font: menu; font-size: larger;">  
<h1> Patients List </h1>

	 <a  style="margin-left: 1400px; margin-top:130pt;  font: menu; font-size:medium;" href="/E_Clinic_EA/j_spring_security_logout">logout</a>

	<table style="border: medium;">
		<thead>
			<tr>
				<th style="padding-right: 20pt;">First Name</th>
				<th style="padding-right: 20pt;">Last Name</th>
				<th style="padding-right: 80pt;">Date of Birth</th>
				<th style="padding-right: 50pt;">Height</th>
				<th style="padding-right: 20pt;">Weight</th>
				<th style="padding-right: 20pt;">Blood</th>
				<th style="padding-right: 20pt;">Email</th>

				<th style="padding-right: 20pt;">Phone</th>
				<th style="padding-right: 20pt;">Edit</th>
				<th style="padding-right: 20pt;">Delete</th>

			</tr>
		</thead>

		<c:forEach var="patient" items="${patient}">
			<tr>
				<td>${patient.firstName}</td>
				<td>${patient.lastName}</td>
				<td>${patient.dateOfBirth}</td>
				<td>${patient.height}</td>
				<td>${patient.weight}</td>
				<td>${patient.bloodType}</td>
				<td>${patient.email}</td>
				<td>${patient.phoneNo}</td>
				<td><a href="update/${patient.id}">edit</a></td>
				<td><a href="delete/${patient.id}"
					onClick="return confirm('Are you sure?');">delete</a></td>
					<td><a href="records/${patient.id}"> Medical Records </a></td>

			</tr>
		</c:forEach>
		
	</table>
</div>
</body>
</html>