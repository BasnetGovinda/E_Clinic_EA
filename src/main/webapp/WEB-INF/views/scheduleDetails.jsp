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
		<div style="margin-left: 400px; margin-top:130pt; font: menu; font-size: larger;">  

	<h1>Update your schedules </h1>

	 <a  style="margin-left: 300px; margin-top:130pt;  font: menu; font-size:medium;" href="/E_Clinic_EA/j_spring_security_logout">logout</a>

	<form modelAttribute="schedule" action="${pageContext.request.contextPath}/updated/${schedule.id}" method="post">	
		<table>
			<tr>
				<td><input  style="width: 270pt; height: 27pt; font: menu; margin-top: 20pt;"  placeholder=" Date " type="text" name="date" value="${schedule.date}" /></td>
			</tr>
		</table>
		<td colspan="2"><input style="width: 70pt; height: 27pt; font: menu; margin-top: 20pt; margin-left: 100pt;" type="submit" value="update" />
	</form>
	
	</div>
</body>
</html>