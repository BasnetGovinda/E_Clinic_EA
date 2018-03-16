<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Login Page </title>
    </head>
    <body>
    <div style="padding-left: 400px; font: menu;">
        <h1 style="margin-top: 130pt; margin-bottom: 20pt;">Please Login </h1>
        <c:if test="${error eq true}">
            <p>${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</p>
        </c:if>
         <form method="post" action="<c:url value='/j_spring_security_check' />">
  
            <input style="font:menu; font-size:medium;  margin-bottom: 10pt; height: 25pt; width: 250px; " placeholder = "Username" name="username" value='<c:if test="${not empty param.login_error}"><c:out value="${SPRING_SECURITY_LAST_USERNAME}"/></c:if>'/> <br />
            <input  style=" font:menu; font-size:medium;  height: 25pt; width: 250px; margin-bottom: 10pt;"  placeholder = "Password" type="password" name='password' /> <br />
            Remember me: <input style="margin-bottom: 20px;" type="checkbox" name="_spring_security_remember_me" /> <br />
            <input type="hidden" name="<c:out value="${_csrf.parameterName}"/>" value="<c:out value="${_csrf.token}"/>"/>
           <input style=" font:menu; font-size:medium; color:white; background-color:teal; padding-top: 10px; width: 100px; height: 40px; margin-bottom: 10pt;" type="submit"  value="Login"/>
 
   </form>
        
        </div>
        
                <a   style="margin-left: 400px; font: menu; margin-top: 130pt;" href="patient/add"> Register </a>
        
    </body>
</html>
