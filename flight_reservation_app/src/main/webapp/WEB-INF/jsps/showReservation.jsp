<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <c:url value="/css/style.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" >
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
  <link href="<c:url value="/css/style.css" />" rel="stylesheet">
</head>
<body>

   <h2>Flight Details</h2>
     FLIGHT_NUMBER:${flight_I.FLIGHT_NUMBER}</br>
      OPERATING_AIRLINES:${flight_I.OPERATING_AIRLINES}</br>
       DEPARTURE_CITY :${flight_I.DEPARTURE_CITY}</br>
        ARRIVAL_CITY:${flight_I.ARRIVAL_CITY}</br>
          DATE_OF_DEPARTURE:${flight_I.DATE_OF_DEPARTURE}</br>
          
          <h2>Enter Passenger Details<h2>
          
          <form action="confirmReservation"method="post">
          FIRST_NAME:<input type="text" name="firstName"/></br>
          LAST_NAME :<input type="text" name="lastName"/></br>
          MIDDLE_NAME:<input type="text" name="middleName"/></br>
          EMAIL:<input type="text" name="email"/></br>
          PHONE :<input type="text" name="phone"/></br>
          <input type="hidden" name="flightId"value="${flight_I.id}"/>
          </br>
          <h2>Enter The Payment Details Here</h2>
          Name On The Card:<input type="text" name="cardHolderName"/></br>
          Card Number:<input type="text" name="cardNumber"/></br>
          Cvv:<input type="text" name="cvv"/></br>
          Expiry Date:<input type="text" name="expiryDate"/></br>
          <input type="Submit" value="complete reservation"/>
          
          
          </form>
          
          
        


</body>
</html>