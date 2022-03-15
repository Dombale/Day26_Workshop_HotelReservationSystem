package com.HotelReservationSystem;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void givenHotelNameCheckIfItIsCorrect() {
		Hotel hotels = new Hotel("LakeWood", 110);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotels);
		List<Hotel> hotelsList = hotelReservation.getHotelList();
		Assert.assertTrue(hotelsList.contains(hotels));
	}

}
