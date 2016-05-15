<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="patient"
		action="${pageContext.request.contextPath}/patient/update"
		method="POST">
		<form:hidden path="id" />
		<label>First Name</label>
		<form:input path="firstName" />
		<br />
		<label>Last Name</label>
		<form:input path="lastName" />
		<br />
		<label>Date of Birth</label>
		<form:input type="date" path="tempdate" />
		<br />
		<label>E-mail</label>
		<form:input path="email" />
		<br />
		<label>Blood Group</label>
		<form:input path="bloodType" />
		<br />
		<label>Phone Number </label>
		<form:input path="phoneNo" />
		<br />
		<label>Weight</label>
		<form:input path="weight" />
		<br />
		<label>height</label>
		<form:input path="height" />
		<br />

		<button type="submit">Update Patient</button>

	</form:form>



</body>
</html>