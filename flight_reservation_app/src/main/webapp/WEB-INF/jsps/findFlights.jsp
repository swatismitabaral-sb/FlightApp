<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <c:url value="/css/styles.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flights</title>
<link href="<c:url value="/css/styles.css" />" rel="stylesheet">
</head>
<body>
   <h1>Find Flights</h1>
  
   
   <form action="findFlights" method="post">
   from:<input type="text" name="from"/>
      to:<input type="text" name="to"/>
         date_Of_Departure :<input type="text" name="date_Of_Departure"/>
            <input type="Submit" value="search"/>
   
   </form>
   
</body>
</html>