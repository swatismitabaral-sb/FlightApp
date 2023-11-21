<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
   
 <c:url value="/css/display.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
<link href="<c:url value="/css/display.css" />" rel="stylesheet">

</head>
<body>

<h2>Reservation Details</h2>
Passenger First Name:${reservation.getPassenger().firstName}<br/>
Passenger Last Name:${reservation.getPassenger().lastName}<br/>
Passenger Middle Name:${reservation.getPassenger().middleName}<br/>
Passenger Email:${reservation.getPassenger().email}<br/>
Passenger Phone No:${reservation.getPassenger().phone}<br/>

 OPERATING_AIRLINES: ${reservation.getFlight().getOPERATING_AIRLINES()}<br/>
 FLIGHT_NUMBER: ${reservation.getFlight().getFLIGHT_NUMBER()}<br/>
 DEPARTURE_CITY: ${reservation.getFlight().getDEPARTURE_CITY()}<br/>
 ARRIVAL_CITY: ${reservation.getFlight().getARRIVAL_CITY()}<br/>
 DATE_OF_DEPARTURE: ${reservation.getFlight(). getDATE_OF_DEPARTURE()}<br/>

<h1>Update No.of Bags & Status</h1>
<form action="proceedToCheckIn" method="post">
    <pre>
        Reservation id <input type="text" name="id" value="${reservation.id}" readonly>
        Number Of Bags <input type="text" name="numberOfBags" />

        <input type="submit" value="proceed" />
    </pre>
</form>



</body>
</html>