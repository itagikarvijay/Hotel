/**
 * 
 */
package com.hotel.booking;

import java.util.Date;
import java.util.List;

/**
 * @author User
 *
 */

public interface IBookingService {

	List<BookingDTO> getBooking();

	void saveBooking(BookingDTO bookingDTO);
	
	void checkOutRoom(BookingDTO bookingDTO);
	
	Boolean checkRoomAvailabilityByDate(Date fromDate, Date toDate, Integer room);
}
