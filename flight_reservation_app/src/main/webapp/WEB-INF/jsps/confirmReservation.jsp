<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
   
   <c:url value="/css/ticketbooked.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
<link href="<c:url value="/css/ticketbooked.css" />" rel="stylesheet">
</head>

<body>

       Your ticket is booked.Your reservation id is :${reservation1Id}

</body>
</html>