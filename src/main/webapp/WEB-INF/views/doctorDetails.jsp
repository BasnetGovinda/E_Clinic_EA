<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form modelAttribute="doctor" action="${pageContext.request.contextPath}/update/${doctor.id}" method="POST">	
		<table>
			<tr>
				<td>FirstName:</td>
				<td><input type="text" name="firstName" value="${doctor.firstName}" /></td>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><input type="text" name="lastName" value="${doctor.lastName}" /></td>
			</tr>
			<tr>
				<td>Sepcialization:</td>
				<td><input type="text" name="sepcialization" value="${doctor.sepcialization}" />
				</td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" value="${doctor.email}" /></td>
			</tr>
		</table>
		<input type="submit" value="update" />
	</form>
	<form action="delete?bookId=${book.id}" method="post">
		<button type="submit">Delete</button>
	</form>
</body>
</html>