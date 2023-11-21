package com.psa.checkin.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.psa.checkin.integration.dto.Reservation;
import com.psa.checkin.integration.dto.ReservationUpdateRequests;

public interface ReservationRestfulClient {
    public Reservation findReservation(Long id);
   // public Reservation updateReservation(@RequestBody ReservationUpdateRequest reservation );

	public Reservation updateReservation( @RequestBody ReservationUpdateRequests reservation1);
}
