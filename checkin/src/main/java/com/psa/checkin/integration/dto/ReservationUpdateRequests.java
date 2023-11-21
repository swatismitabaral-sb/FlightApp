package com.psa.checkin.integration.dto;

public class ReservationUpdateRequests {
	
	private Long id;
	private int NumberOfBags;
	private boolean checkedIn;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumberOfBags() {
		return NumberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		NumberOfBags = numberOfBags;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	
	
}
