/**
 * 
 */
package com.hotel.master.customer;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
//	@PutMapping("/create")
//	public ResponseEntity<String> putOne(@RequestBody CustomerDTO customer ) {
//		customerService.createCustomer(customer);
//		return new ResponseEntity<>("Customer created.!", HttpStatus.OK);
//	}
//	
	@PatchMapping("/create")
	public ResponseEntity<String> updateOne(@RequestBody @Valid CustomerDTO customer) {
//		 if (errors.hasErrors()) {
//		        return new ResponseEntity(new Violation(errors.getObjectName(),"Not valid"), HttpStatus.BAD_REQUEST);
//		    }
		customerService.createCustomer(customer);
		return new ResponseEntity<>("Customer updated.!", HttpStatus.OK);
	}

}
