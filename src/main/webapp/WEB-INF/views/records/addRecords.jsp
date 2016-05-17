<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Add Medical Record </title>
</head>
<body>

<h1>Add Medical Record for ${patient_id}</h1>
	<form:form modelAttribute="recordForm"
		action="${pageContext.request.contextPath}/patient/records/list/${doctor_id}/add/${patient_id}" method="POST">
		<label>Sickness </label>
		<form:input path="sickness" />
		<br />
		
		<label>Medication </label>
		<form:input path="medication" />
		<br />
		
		<label>Date </label>
		<form:input type="date" path="date" />
		<br />
		
		<button type="submit">  Add Record  </button>

	</form:form>

</body>
</html>