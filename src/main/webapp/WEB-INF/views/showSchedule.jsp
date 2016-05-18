<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div style="margin-left: 400px; margin-top:130pt; font: menu; font-size: larger;">   

	<h1>List of your shedules </h1>
	 <a  style="margin-left: 300px; margin-top:130pt;  font: menu; font-size:medium;" href="/E_Clinic_EA/j_spring_security_logout">logout</a>
	
	<table>
		<c:forEach var="sche" items="${schedule}">
			<tr>
				<td>${sche.date}</td>
				<td>${sche.time}</td>
				<td><a href="schedule/${sche.id}">edit</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>