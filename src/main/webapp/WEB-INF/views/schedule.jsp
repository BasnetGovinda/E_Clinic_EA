<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Shedule</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
  <script>
	$(function() {
		$("#datepicker").datepicker();		
	});

</script>
</head>
<body>
<div style="margin-left: 400px; margin-top:130pt; font: menu; font-size: larger;">   

	<h1>Here Is Your Schedule For The Day</h1>
	
		 <a  style="margin-left: 550px; margin-top:130pt;  font: menu; font-size:medium;" href="/E_Clinic_EA/j_spring_security_logout">logout</a>
	
	<form:form method="POST" action="schedules" modelAttribute="schedulle">
		<table>			
			<tr>
				<td style="padding-left: 85pt; padding-top: 50pt;"><form:label path="tempdate">I am available at:</form:label></td>
				<fmt:formatDate pattern="MM/dd/yyyy h:mm:ss aaa" value="${schedule.date}"
					var="fmtTimeOfBirth" />
				<td style=" padding-top: 50pt;"><form:input path="tempdate" type="datetime-local" value="${fmtTimeOfBirth}" /></td>
			</tr>
			
			<tr>
				<td colspan="2"><input style="width: 70pt; height: 27pt; font: menu; margin-top: 20pt; margin-left: 200pt;" type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	</div>
</body>
</html>