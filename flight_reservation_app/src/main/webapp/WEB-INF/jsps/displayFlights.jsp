<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
   
   <c:url value="/css/styling.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
<link href="<c:url value="/css/styling.css" />" rel="stylesheet">
</head>
<body>
  
      
        <h1>Flight Available</h1>
        <table border="1">
            <tr>
                <th>OPERATING_AIRLINES</th>
                <th>DEPARTURE_CITY</th>
                <th>ARRIVAL_CITY</th>
                <th>ESTIMATED_DEPARTURE_TIME</th>
            </tr>
          <c:forEach items="${flight}" var="flight">
<tr>
        <td>${flight.OPERATING_AIRLINES}</td>
        <td>${flight.DEPARTURE_CITY}</td>
        <td>${flight.ARRIVAL_CITY}</td>
        <td>${flight.ESTIMATED_DEPARTURE_TIME}</td>
        
         <td><a href="showCompleteReservation?flightId=${flight.id}">Select</a>

</tr>
</c:forEach>
        </table>
 
  
</body>
  
</html>