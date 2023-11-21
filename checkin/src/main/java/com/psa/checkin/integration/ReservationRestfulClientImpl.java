package com.psa.checkin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.psa.checkin.integration.dto.Reservation;
import com.psa.checkin.integration.dto.ReservationUpdateRequests;

@Component
public class ReservationRestfulClientImpl implements ReservationRestfulClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flights/reservation/"+id,Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequests reservation1) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation  reservation = restTemplate.postForObject("http://localhost:8080/flights/reservation/", reservation1, Reservation.class);
		

		return  reservation;
	}

}
