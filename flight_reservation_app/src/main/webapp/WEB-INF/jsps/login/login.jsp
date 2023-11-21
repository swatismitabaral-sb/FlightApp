<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
   
   <c:url value="/css/login.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="<c:url value="/css/login.css" />" rel="stylesheet">
<h1>Login here</h1>
</head>
<body>
     <form action="verifyLogin"method="post">
     
      Email:<input type="text" name="emailId"/></br><br/>
                	Password:<input type="password" name="password"/></br><br/>
                	  <input type="submit" value="Login"/>
                	  
     </form>
     ${error}

</body>
</html>