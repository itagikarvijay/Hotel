/**
 * 
 */
package com.hotel.master.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dto.BaseDTO;

/**
 * @author User
 *
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerResource {

	@Autowired
	ICustomerService customerService;

	@RequestMapping("/one/{id}")
	public ResponseEntity<BaseDTO> getOne(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(customerService.getOne(id), HttpStatus.OK);
	}

}
