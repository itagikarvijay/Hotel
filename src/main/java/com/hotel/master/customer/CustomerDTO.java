/**
 * 
 */
package com.hotel.master.customer;

import java.util.ArrayList;
import java.util.List;

import com.hotel.booking.BookingDTO;
import com.hotel.dto.BaseDTO;

/**
 * @author User
 *
 */
public class CustomerDTO extends BaseDTO {

	private Integer id;

	private String name;

	private List<BookingDTO> booking;

	public CustomerDTO() {
		this.booking = new ArrayList();
	}

	public CustomerDTO(String name) {
		this.name = name;
		this.booking = new ArrayList();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the bookingDTO
	 */
	public List<BookingDTO> getBooking() {
		return booking;
	}

	/**
	 * @param bookingDTO the bookingDTO to set
	 */
	public void setBooking(List<BookingDTO> booking) {
		this.booking = booking;
	}

}
