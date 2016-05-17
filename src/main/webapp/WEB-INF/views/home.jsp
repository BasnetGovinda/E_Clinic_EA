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
    <a href="doctor/1/patientsList"> Appointmetns </a>
    <br/>
                      <sec:authorize access="hasRole('ROLE_ADMIN')" >
                        <a href="records/doctor/1/patientsList"> Patients List </a>
                      </sec:authorize>
                      <br/>
                      <sec:authorize access="hasRole('ROLE_USER')" >
                        <a href="records/patient/3"> Medical Records </a>
                      </sec:authorize>
    </body>
</html>
