package com.psa.flight_reservation_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psa.flight_reservation_app.dto.ReservationRequest;
import com.psa.flight_reservation_app.entity.Reservation;
import com.psa.flight_reservation_app.service.ReservationService;


@Controller
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
	
	
	@RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationRequest reservation,ModelMap modelMap) {
		//System.out.println(reservation.getFlightId());
		
		Reservation reservation1Id = reservationService.bookFlight(reservation);
		modelMap.addAttribute("reservation1Id",reservation1Id.getId());
		
	
		
		
		return "confirmReservation";
		
		
	}

}
