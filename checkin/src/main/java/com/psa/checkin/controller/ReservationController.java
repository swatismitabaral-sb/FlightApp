package com.psa.checkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.psa.checkin.integration.ReservationRestfulClient;
import com.psa.checkin.integration.dto.Reservation;
import com.psa.checkin.integration.dto.ReservationUpdateRequests;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationRestfulClient restClient;
	
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn() {
		return "startCheckIn";
		
		
	}
	
     @RequestMapping("/proceedCheckIn")
     public String proceedCheckIn(@RequestParam("id")Long id,ModelMap modelMap){
    	 Reservation reservation = restClient.findReservation(id);
    	 modelMap.addAttribute("reservation", reservation);
    	 return "displayReservation";
     } 	 
     
     @RequestMapping("/proceedToCheckIn")
   
     public String proceedToCheckIn(@RequestParam(name = "id") Long id, 
                                     @RequestParam(name = "numberOfBags", required = false, defaultValue = "0") int numberOfBags) {
        
     

    	 ReservationUpdateRequests reservation1=new ReservationUpdateRequests();
         reservation1.setId(id);
         reservation1.setNumberOfBags(numberOfBags);
         reservation1.setCheckedIn(true);
    	
    	 restClient.updateReservation(reservation1);
    	 return "confirmReservation";
    }
    	
}
