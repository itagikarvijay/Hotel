/**
 * 
 */
package com.hotel.booking;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.hotel.entity.BaseEntity;
import com.hotel.master.customer.Customer;
import com.hotel.rooms.Rooms;

/**
 * @author User
 *
 */
@Entity
@Table(name = "booking")
@DynamicUpdate
public class Booking extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "arrival_date")
	private Date arrivalDate;

	@Column(name = "depature_date")
	private Date depatureDate;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "booking_type")
	private String bookingType;

	@Column(name = "billing_instructions")
	private String billingInstructions;

	@Column(name = "deposit_amount")
	private Float depositAmount;

	@Column(name = "booking_confirmed_by")
	private String bookingConfirmedBy;

	@Column(name = "booking_taken_by")
	private String bookingTakenBy;

	@Column(name = "no_of_guest")
	private Integer noOfGuest;

	@Column(name = "status")
	private String status;

	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "room")
	private Rooms room;
	
	@ManyToOne(cascade=CascadeType.ALL) 
	@JoinColumn(name="customer")
	private Customer customer;

	public Booking() {

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
	public Rooms getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(Rooms room) {
		this.room = room;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((arrivalDate == null) ? 0 : arrivalDate.hashCode());
		result = prime * result + ((billingInstructions == null) ? 0 : billingInstructions.hashCode());
		result = prime * result + ((bookingConfirmedBy == null) ? 0 : bookingConfirmedBy.hashCode());
		result = prime * result + ((bookingTakenBy == null) ? 0 : bookingTakenBy.hashCode());
		result = prime * result + ((bookingType == null) ? 0 : bookingType.hashCode());
		result = prime * result + ((depatureDate == null) ? 0 : depatureDate.hashCode());
		result = prime * result + ((depositAmount == null) ? 0 : depositAmount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((noOfGuest == null) ? 0 : noOfGuest.hashCode());
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (arrivalDate == null) {
			if (other.arrivalDate != null)
				return false;
		} else if (!arrivalDate.equals(other.arrivalDate))
			return false;
		if (billingInstructions == null) {
			if (other.billingInstructions != null)
				return false;
		} else if (!billingInstructions.equals(other.billingInstructions))
			return false;
		if (bookingConfirmedBy == null) {
			if (other.bookingConfirmedBy != null)
				return false;
		} else if (!bookingConfirmedBy.equals(other.bookingConfirmedBy))
			return false;
		if (bookingTakenBy == null) {
			if (other.bookingTakenBy != null)
				return false;
		} else if (!bookingTakenBy.equals(other.bookingTakenBy))
			return false;
		if (bookingType == null) {
			if (other.bookingType != null)
				return false;
		} else if (!bookingType.equals(other.bookingType))
			return false;
		if (depatureDate == null) {
			if (other.depatureDate != null)
				return false;
		} else if (!depatureDate.equals(other.depatureDate))
			return false;
		if (depositAmount == null) {
			if (other.depositAmount != null)
				return false;
		} else if (!depositAmount.equals(other.depositAmount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfGuest == null) {
			if (other.noOfGuest != null)
				return false;
		} else if (!noOfGuest.equals(other.noOfGuest))
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", arrivalDate=" + arrivalDate + ", depatureDate=" + depatureDate + ", name="
				+ name + ", address=" + address + ", telephone=" + telephone + ", bookingType=" + bookingType
				+ ", billingInstructions=" + billingInstructions + ", depositAmount=" + depositAmount
				+ ", bookingConfirmedBy=" + bookingConfirmedBy + ", bookingTakenBy=" + bookingTakenBy + ", noOfGuest="
				+ noOfGuest + ", status=" + status + ", room=" + room + "]";
	}

}
