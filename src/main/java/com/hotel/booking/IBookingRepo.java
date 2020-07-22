/**
 * 
 */
package com.hotel.booking;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author User
 *
 */
@Repository
public interface IBookingRepo extends JpaRepository<Booking, Integer> {

	Booking findByArrivalDateLessThanEqualAndDepatureDateGreaterThanEqualAndRoomIdEquals(Date arrivalDate, Date departureDate, Integer room);

}
