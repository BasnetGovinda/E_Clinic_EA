<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> List of patients Records </title>
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

<div style="margin-left: 400px; margin-top:130pt; font: menu; font-size: larger;">   

<div  style="margin-bottom: 20pt;">
		    <b style="margin-bottom: 30pt; font-size: larger;">Medical Records</b>
		    <br/>
		    <b style="padding-top: 10pt; color: green;">  Patient Name: ${patient_name}</b>
<a  style="margin-left: 200px; margin-top:130pt; font: menu; font-size:medium;" href="/E_Clinic_EA/j_spring_security_logout">logout</a>
</div>
	<table>
		<thead>
			<tr>
				<th style="padding-right: 25pt;"> Following Doctor          </th>
				<th style="padding-right: 25pt;"> Sickness          </th>
				<th style="padding-right: 25pt;"> Medication          </th>
				<th style="padding-right: 25pt;"> Date          </th>
				<th style="padding-right: 25pt;">  </th>
				<th>  </th>

			</tr>
		</thead>

		<c:forEach var="record" items="${record}">
			<tr>
				<td>${record.sickness}</td>
				<td>${record.sickness}</td>
				<td>${record.medication}</td>
				<td>${record.date}</td>
				
				      <sec:authorize access="hasRole('ROLE_ADMIN')" >
                       <td> <a href="update/${record.id}">edit</a> </td>
                      </sec:authorize>
                     
                      <sec:authorize access="hasRole('ROLE_ADMIN')" >
                      <td>  <a href="delete/${record.id}"
					onClick="return confirm('Are you sure?');">delete</a></td>
                      </sec:authorize>
                      

			</tr>
		</c:forEach>
	</table>

</div>
                      <sec:authorize access="hasRole('ROLE_ADMIN')" >
                         <a  style="margin-left: 400px; margin-top:130pt; font: menu; font-size: larger;" href="add/${patient_id}"> Add Record</a>
                      </sec:authorize>

</body>
</html>