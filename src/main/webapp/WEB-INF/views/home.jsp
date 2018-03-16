<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>HOME</title>
    </head>
    <body>
    
		<div style="margin-left: 400px; margin-top:130pt; font: menu; font-size: larger;">  
		
    					<sec:authorize access="hasRole('ROLE_ADMIN')" >
                        <h2> Welcome, Doctor ${user}</h2>
                      </sec:authorize>
                      
                      <sec:authorize access="hasRole('ROLE_USER')" >
                       <h2> Welcome, ${user}  We wish you a good luck!</h2>
                      </sec:authorize>
                   
                   <table>
                   <tr>
                   
                   <sec:authorize access="hasRole('ROLE_ADMIN')" >
                         <td>
  							  <a href="showSchedule"  style="margin-right: 20pt;"> My Schedules </a> </td>
  						<td>
  				   </sec:authorize>
  				   
                       <td>
  							  <a href="appointment/getlistofappointment"  style="margin-right: 20pt;"> Appointmetns </a> </td>
  						<td>	  
                      <sec:authorize access="hasRole('ROLE_ADMIN')" >
                        <a href="records/doctor/1/patientsList" style="margin-right: 20pt;"> Patients List </a> 
                      </sec:authorize>
                      </td>
                      
                      <td>
                      <sec:authorize access="hasRole('ROLE_USER')" >
                        <a href="records/patient/3"  style="margin-right: 20pt;"> Medical Records </a>
                      </sec:authorize>
                      <a href="j_spring_security_logout" >logout</a>
                      
                      </td>
                      </tr>
                      </table>   
                      </div>
    </body>
    
</html>
