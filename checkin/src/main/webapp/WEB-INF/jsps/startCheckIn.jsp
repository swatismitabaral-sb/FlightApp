<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
   
 <c:url value="/css/start.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Start Checkin</title>
<link href="<c:url value="/css/start.css" />" rel="stylesheet">

</head>
<body>
    <h2>Start to CheckIn</h2>
    <form action="proceedCheckIn" method="post">
    
    
        Enter Your Reservation Id:<input type="text" name="id"/>
        <input type="submit" value="start"/>
    </form>
</body>
</html>