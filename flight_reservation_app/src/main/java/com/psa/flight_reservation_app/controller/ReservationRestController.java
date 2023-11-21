package com.psa.flight_reservation_app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psa.flight_reservation_app.dto.ReservationUpdateRequest;
import com.psa.flight_reservation_app.entity.Reservation;
import com.psa.flight_reservation_app.repository.ReservationRepostory;



@RestController
public class ReservationRestController {
	
	@Autowired
	private ReservationRepostory reservationRepo;
	
	
	
	@RequestMapping("/reservation/{id}")
	public Reservation findReservation(@PathVariable("id")Long id) {
		Optional<Reservation> findById = reservationRepo.findById(id);
		Reservation reservation = findById.get();
		return  reservation;
	
}
	
	
	@RequestMapping("/reservation")
	public Reservation updateReservation(@RequestBody  ReservationUpdateRequest reservation1) {
		Optional<Reservation> findById = reservationRepo.findById(reservation1.getId());
		Reservation reservation=findById.get();
		reservation.setCheckedIn(reservation1.isCheckedIn());
		reservation.setNumberOfBags(reservation1.getNumberOfBags());
		return reservationRepo.save(reservation);
	}
	 
   }


