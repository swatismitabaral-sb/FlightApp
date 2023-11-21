<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
   
   <c:url value="/css/showReg.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
<link href="<c:url value="/css/showReg.css" />" rel="stylesheet">
</head>
<body>

   <h2>Create New Account</h2>
   <form action="saveReg"method="post">
   
       FirstName:<input type="text" name="firstName"/></br><br/>
          LastName:<input type="text" name="lastName"/></br><br/>
             Email:<input type="text" name="email"/></br><br/>
                	Password:<input type="password" name="password"/></br><br/>
                	  <input type="submit" value="save"/>
                	  
       
   </form>
</body>
</html>