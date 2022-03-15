package com.HotelReservationSystem;

public class Hotel {
	private String hotelName;
	private double rateForRegularCustomerWeekDay;

	/*
	 * default constructor
	 */
	public Hotel() {

	}

	public Hotel(String hotelName, double rateForRegularCustomerWeekDay) {
		this.hotelName = hotelName;
		this.rateForRegularCustomerWeekDay = rateForRegularCustomerWeekDay;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getRateForRegularCustomerWeekDay() {
		return rateForRegularCustomerWeekDay;
	}

	public void setRateForRegularCustomerWeekDay(double rateForRegularCustomerWeekDay) {
		this.rateForRegularCustomerWeekDay = rateForRegularCustomerWeekDay;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rateForRegularCustomerWeekDay=" + rateForRegularCustomerWeekDay
				+ "]";
	}

}
