/**
 * 
 */
package com.hotel.booking;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.util.Utility;

/**
 * @author User
 *
 */
@RestController
@RequestMapping("/api/booking")
public class BookingResource {

	@Autowired
	IBookingService bookingService;

	@GetMapping("/bookings")
	public List<BookingDTO> getBooking() {
		return bookingService.getBooking();
	}

	@PostMapping("/bookRoom")
	public ResponseEntity<String> bookRoom(@RequestBody BookingDTO bookingDTO) {
		bookingService.saveBooking(bookingDTO);
		return new ResponseEntity<>("Room booked.!", HttpStatus.CREATED);
	}

	@PostMapping("/checkOutRoom")
	public ResponseEntity<String> checkOutRoom(@RequestBody BookingDTO bookingDTO) {
		bookingService.checkOutRoom(bookingDTO);
		return new ResponseEntity<>("Room CheckedOut.!", HttpStatus.OK);
	}

	@GetMapping("/checkRoomAvailabilityByDate")
	public ResponseEntity<String> checkRoomAvailabilityByDate(
			@RequestParam(name = "fromDate") String fromDate,
			@RequestParam(name = "toDate") String todate,
			@RequestParam(name = "room") Integer room) throws ParseException {
		Date frDate = Utility.convertToDate(fromDate);
		Date toDate = Utility.convertToDate(todate);
		if (bookingService.checkRoomAvailabilityByDate(frDate, toDate,room)) {
			return new ResponseEntity<>("Rooms are available.!", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Rooms not available.!", HttpStatus.OK);
		}
	}
}
