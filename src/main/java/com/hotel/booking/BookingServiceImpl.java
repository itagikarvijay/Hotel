/**
 * 
 */
package com.hotel.booking;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.mapper.MapperClz;
import com.hotel.rooms.IRoomsRepo;
import com.hotel.rooms.Rooms;
import com.hotel.util.IConstants;

/**
 * @author User
 *
 */
@Service
@Transactional
public class BookingServiceImpl implements IBookingService {

	@Autowired
	MapperClz<?> mapperClz;

	@Autowired
	IBookingRepo bookingRepo;

	@Autowired
	IRoomsRepo roomsRepo;

	@Override
	public List<BookingDTO> getBooking() {
		return mapperClz.convertToDto(bookingRepo.findAll());
	}

	@Override
	public void saveBooking(BookingDTO bookingDTO) {
		Booking booking = mapperClz.convertToEntity(bookingDTO);
		Rooms room = roomsRepo.findById(bookingDTO.getRoom().getId()).get();
		room.setStatus(IConstants.BOOKED);
		booking.setRoom(room);
		bookingRepo.save(booking);
	}

	@Override
	public void checkOutRoom(BookingDTO bookingDTO) {
		Booking booking = bookingRepo.findById(bookingDTO.getId()).get();
		Rooms room = booking.getRoom();
		room.setStatus(IConstants.AVAILABLE);
		booking.setRoom(room);
		booking.setDepatureDate(bookingDTO.getDepatureDate());
		booking.setStatus(IConstants.CHECKEDOUT);
		bookingRepo.save(booking);
	}

	@Override
	public Boolean checkRoomAvailabilityByDate(Date fromDate, Date toDate, Integer room) {
		Booking booking = (Booking) bookingRepo
				.findByArrivalDateLessThanEqualAndDepatureDateGreaterThanEqualAndRoomIdEquals(fromDate, toDate, room);
		return booking == null ? Boolean.TRUE : Boolean.FALSE;
	}

}
