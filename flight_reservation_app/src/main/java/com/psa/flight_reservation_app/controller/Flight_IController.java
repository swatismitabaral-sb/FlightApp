package com.psa.flight_reservation_app.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psa.flight_reservation_app.entity.Flight_I;
import com.psa.flight_reservation_app.repository.FlightRepository;

@Controller
public class Flight_IController {
	@Autowired
	private FlightRepository flightRepo;
	
	
	@RequestMapping("/findFlights")
	 public String findFlights(@RequestParam("from") String from,@RequestParam("to") String to,
	            @RequestParam("date_Of_Departure") @DateTimeFormat(pattern="yyyy-MM-dd") Date date_Of_Departure,ModelMap modelMap)
	    {
		
		    
		    List<Flight_I> flight = flightRepo.findFlights(from,to,date_Of_Departure);
	    
	         modelMap.addAttribute("flight", flight);
	         return "displayFlights";
}      
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId")Long flightId,ModelMap modelMap) {
		//System.out.println(flightId);
		Optional<Flight_I> findById = flightRepo.findById(flightId);
		Flight_I flight_I = findById.get();
//		System.out.println(flight_I.getId());
//		System.out.println(flight_I.getARRIVAL_CITY());
//		System.out.println(flight_I.getDEPARTURE_CITY());
//		System.out.println(flight_I.getFLIGHT_NUMBER());
//		System.out.println(flight_I.getOPERATING_AIRLINES());
		modelMap.addAttribute("flight_I", flight_I);
		return "showReservation";
		
	}
}
