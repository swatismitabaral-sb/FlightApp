package com.psa.flight_reservation_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psa.flight_reservation_app.dto.ReservationRequest;
import com.psa.flight_reservation_app.entity.Flight_I;
import com.psa.flight_reservation_app.entity.Passenger;
import com.psa.flight_reservation_app.entity.Reservation;
import com.psa.flight_reservation_app.repository.FlightRepository;
import com.psa.flight_reservation_app.repository.PassengerRepository;
import com.psa.flight_reservation_app.repository.ReservationRepostory;
import com.psa.flight_reservation_app.utility.EmailUtil;
import com.psa.flight_reservation_app.utility.PDFgenerator;


@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepostory reservationRepo;
	
	@Autowired
    PDFgenerator pdfGenerator;

	@Autowired
	private EmailUtil emailUtil;
	@Override
	public Reservation bookFlight(ReservationRequest reservation) {
		
		 
		

		Passenger passenger =new Passenger ();
		
		passenger.setFirstName(reservation.getFirstName());
		passenger.setLastName(reservation.getLastName());
		passenger.setMiddleName(reservation.getMiddleName());
		passenger.setEmail(reservation.getEmail());
		passenger.setPhone(reservation.getPhone());
		
		passengerRepo.save(passenger);
		
		
		long flightId = reservation.getFlightId();
		Optional<Flight_I> findById = flightRepo.findById(flightId);
		Flight_I flight_I = findById.get();
		
		
		Reservation reservation1 =new Reservation();
		reservation1.setFlight(flight_I);
		reservation1.setPassenger(passenger);
		reservation1.setCheckedIn(false);
		reservation1.setNumberOfBags(0);
	    String filePath="D:\\6thjune\\flight_reservation_app\\tickets\\reservation1"+reservation1.getFlight()+".pdf";
		
		reservationRepo.save(reservation1);
		pdfGenerator.generateItinerary(reservation1,filePath);
		emailUtil.sendItinerary(passenger.getEmail(),filePath);
	
		return reservation1;
		
		
	
		
	}

}
