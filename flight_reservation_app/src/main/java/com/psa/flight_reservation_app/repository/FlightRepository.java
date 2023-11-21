package com.psa.flight_reservation_app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.psa.flight_reservation_app.entity.Flight_I;

public interface FlightRepository extends JpaRepository<Flight_I,Long>
{

    @Query("from Flight_I where Departure_City=:Departure_City and Arrival_City=:Arrival_City and date_Of_Departure=:date_Of_Departure")
    List<Flight_I> findFlights(@Param("Departure_City") String from,@Param("Arrival_City")
    String to,@Param("date_Of_Departure") Date date_Of_Departure);
  
}
