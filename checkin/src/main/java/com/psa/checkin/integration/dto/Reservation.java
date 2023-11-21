package com.psa.checkin.integration.dto;

public class Reservation {
	
	private Long id;
	private boolean checkedIn;
	private int NumberOfBags;
	private Passenger passenger;
	private Flight_I flight;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return NumberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		NumberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight_I getFlight() {
		return flight;
	}
	public void setFlight(Flight_I flight) {
		this.flight = flight;
	}
	
	

}
