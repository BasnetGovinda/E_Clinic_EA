<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Add Medical Record </title>
</head>
<body>

<div style="margin-left: 400px; margin-top:130pt; font: menu; font-size: larger;">   


<h1>Add Medical Record for ${patient_name}</h1>
<a  style="margin-left: 450px; margin-top:130pt; font: menu; font-size:medium;" href="/E_Clinic_EA/j_spring_security_logout">logout</a>

	<form:form modelAttribute="recordForm"
		action="${pageContext.request.contextPath}/records/patient/list/${doctor_id}/add/${patient_id}" method="POST">
		<form:input  style=" margin-left: 50px; width: 270pt; height: 27pt; font: menu; margin-top: 20pt;"  placeholder=" Sickness " path="sickness" />
		<br />
		
		<form:input  style=" margin-left: 50px;  width: 270pt; height: 27pt; font: menu; margin-top: 20pt;"  placeholder=" Medication " path="medication" />
		<br />
		<br>
		<b style=" margin-left: 50px; ">Date : </b>
		<fmt:formatDate pattern="MM/dd/yyyy h:mm:ss aaa" value="${recordForm.date}" var="fmtTimeOfBirth" />
		<form:input  style=" width: 225pt; height: 27pt; font: menu; margin-top: 20pt;"  placeholder=" Date " path="date" type="datetime-local" value="${fmtTimeOfBirth}" />
		<br />
		
		<button  style="width: 70pt; height: 27pt; font: menu; margin-top: 20pt; margin-left: 150pt;" type="submit">  Add Record  </button>

	</form:form>

</div>
</body>
</html>