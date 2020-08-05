/**
 * 
 */
package com.hotel.master.customer;

import com.hotel.dto.BaseDTO;

/**
 * @author User
 *
 */
public interface ICustomerService {
	

	
	BaseDTO getOne(Integer id);
	
	void createCustomer(CustomerDTO customer);


}
