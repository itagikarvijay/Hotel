package com.hotel.master.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.booking.Booking;
import com.hotel.booking.BookingDTO;
import com.hotel.dto.BaseDTO;
import com.hotel.mapper.MapperClz;
import com.hotel.rooms.Rooms;
import com.hotel.rooms.RoomsDTO;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerRepo customerRepo;

	@Autowired
	MapperClz<?> mapperClz;

	@Override
	public BaseDTO getOne(Integer id) {
		Optional<Customer> customer = customerRepo.findById(id);
		return converToDTO(customer);
	}

	private CustomerDTO converToDTO(Optional<Customer> customer) {

		CustomerDTO customerDTO = new CustomerDTO();

		if (customer.isPresent()) {
			Customer c = customer.get();
			customerDTO.setId(c.getId());
			customerDTO.setName(c.getName());

			for (Booking booking : c.getBooking()) {
				BookingDTO bDTO = new BookingDTO();
				bDTO.setArrivalDate(booking.getArrivalDate());
				bDTO.setAddress(booking.getAddress());
				bDTO.setBillingInstructions(booking.getBillingInstructions());
				bDTO.setBookingConfirmedBy(booking.getBookingConfirmedBy());
				bDTO.setBookingTakenBy(booking.getBookingTakenBy());
				bDTO.setBookingType(booking.getBookingType());
				bDTO.setDepatureDate(booking.getDepatureDate());
				bDTO.setDepositAmount(booking.getDepositAmount());
				bDTO.setName(booking.getName());
				bDTO.setNoOfGuest(booking.getNoOfGuest());
				Rooms room = booking.getRoom();
				RoomsDTO roomDTO = new RoomsDTO();
				roomDTO.setName(room.getName());
				bDTO.setRoom(roomDTO);
				bDTO.setTelephone(booking.getTelephone());
				customerDTO.getBooking().add(bDTO);
			}
		}
		return customerDTO;
	}

}
