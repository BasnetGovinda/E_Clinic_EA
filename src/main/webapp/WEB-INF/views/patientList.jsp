<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Date of Birth</th>
				<th>Height</th>
				<th>Weight</th>
				<th>Blood</th>
				<th>Email</th>

				<th>Phone</th>
				<th>Edit</th>
				<th>Delete</th>

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

</body>
</html>