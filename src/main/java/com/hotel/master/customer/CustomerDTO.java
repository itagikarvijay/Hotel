/**
 * 
 */
package com.hotel.master.customer;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.hotel.booking.BookingDTO;
import com.hotel.dto.BaseDTO;

/**
 * @author User
 *
 */
public class CustomerDTO extends BaseDTO {

	private Integer id;

	@Size(min=2, max=240)
	private String name;

	private String address;

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

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
