/**
 * 
 */
package com.hotel.master.customer;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.hotel.exceptions.NotFoundException;

/**
 * @author User
 *
 */

@ControllerAdvice 
public class CustomerExceptions extends ResponseEntityExceptionHandler{

//	@ExceptionHandler({ RuntimeException.class, NotFoundException.class, BadCredentialsException.class})
//	public ResponseEntity<ErrorDetails> handleNotFoundException(NotFoundException ex, WebRequest request) {
//		System.out.print("Customer not found exception");
//		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),"Customer not found.!");
//		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
//	}
	
	@ExceptionHandler({ AccessDeniedException.class})
	public ModelAndView handleNotFoundException(AccessDeniedException ex, WebRequest request) {
		System.out.print("Customer not found exception");
		ModelAndView model = new ModelAndView("home");
		model.addObject("accessNotAllowed", "User has no access to the resource.!");
		return model;
	}
	

}
