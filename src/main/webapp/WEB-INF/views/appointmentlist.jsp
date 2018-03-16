<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appointments List </title>
</head>
<body>

<div style="margin-left: 400px; margin-top:130pt; font: menu; font-size: larger;">   

				<h2> Appointments List </h2>
 <a  style="margin-left: 400px; margin-top:130pt;  font: menu; font-size:medium;" href="/E_Clinic_EA/j_spring_security_logout">logout</a>
 <br/>
                       <sec:authorize access="hasRole('ROLE_USER')" >
                        	 <a style="margin-bottom: 20pt;" href="make"> Shedule New Appointment</a>
                      </sec:authorize>
                      
	<table style="margin-bottom: 120; ">
		<thead>
			<tr>
				<th>Appointment Date/time</th>
			</tr>
			<c:forEach var="app" items="${appointments}">
				<tr>
					<td>${app.appointmentDate}</td>
					<%-- 	<td>${app.doctor.firstName}</td> --%>
					<td><a
						href="${pageContext.request.contextPath}/appointment/delete/${app.id}"
						onClick="return confirm('Are you sure to cancel appointment?');"}>Cancel
							appointment</a></td>
				</tr>
			</c:forEach>

		</thead>

	</table>
</div>
</body>
</html>