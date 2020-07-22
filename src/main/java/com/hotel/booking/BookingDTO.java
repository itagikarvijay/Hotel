/**
 * 
 */
package com.hotel.booking;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hotel.dto.BaseDTO;
import com.hotel.master.customer.CustomerDTO;
import com.hotel.rooms.RoomsDTO;

/**
 * @author User
 *
 */
public class BookingDTO extends BaseDTO {

	private Integer id;

	private Date arrivalDate;

	private Date depatureDate;

	private String name;

	private String address;

	private String telephone;

	private String bookingType;

	private String billingInstructions;

	private Float depositAmount;

	private String bookingConfirmedBy;

	private String bookingTakenBy;

	private Integer noOfGuest;

	private RoomsDTO room;

	private CustomerDTO customer;

	public BookingDTO() {

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
	 * @return the arrivalDate
	 */
	public Date getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * @param arrivalDate the arrivalDate to set
	 */
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 * @return the depatureDate
	 */
	public Date getDepatureDate() {
		return depatureDate;
	}

	/**
	 * @param depatureDate the depatureDate to set
	 */
	public void setDepatureDate(Date depatureDate) {
		this.depatureDate = depatureDate;
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

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the bookingType
	 */
	public String getBookingType() {
		return bookingType;
	}

	/**
	 * @param bookingType the bookingType to set
	 */
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	/**
	 * @return the billingInstructions
	 */
	public String getBillingInstructions() {
		return billingInstructions;
	}

	/**
	 * @param billingInstructions the billingInstructions to set
	 */
	public void setBillingInstructions(String billingInstructions) {
		this.billingInstructions = billingInstructions;
	}

	/**
	 * @return the depositAmount
	 */
	public Float getDepositAmount() {
		return depositAmount;
	}

	/**
	 * @param depositAmount the depositAmount to set
	 */
	public void setDepositAmount(Float depositAmount) {
		this.depositAmount = depositAmount;
	}

	/**
	 * @return the bookingConfirmedBy
	 */
	public String getBookingConfirmedBy() {
		return bookingConfirmedBy;
	}

	/**
	 * @param bookingConfirmedBy the bookingConfirmedBy to set
	 */
	public void setBookingConfirmedBy(String bookingConfirmedBy) {
		this.bookingConfirmedBy = bookingConfirmedBy;
	}

	/**
	 * @return the bookingTakenBy
	 */
	public String getBookingTakenBy() {
		return bookingTakenBy;
	}

	/**
	 * @param bookingTakenBy the bookingTakenBy to set
	 */
	public void setBookingTakenBy(String bookingTakenBy) {
		this.bookingTakenBy = bookingTakenBy;
	}

	/**
	 * @return the noOfGuest
	 */
	public Integer getNoOfGuest() {
		return noOfGuest;
	}

	/**
	 * @param noOfGuest the noOfGuest to set
	 */
	public void setNoOfGuest(Integer noOfGuest) {
		this.noOfGuest = noOfGuest;
	}

	/**
	 * @return the room
	 */
	public RoomsDTO getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(RoomsDTO room) {
		this.room = room;
	}

	/**
	 * @return the customer
	 */
	public CustomerDTO getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

}
