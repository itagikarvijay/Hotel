/**
 * 
 */
package com.hotel.master.customer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author User
 *
 */
public class ValidationErrorResponse {

	private List<Violation> violations = new ArrayList<>();

	/**
	 * @return the violations
	 */
	public List<Violation> getViolations() {
		return violations;
	}

	/**
	 * @param violations the violations to set
	 */
	public void setViolations(List<Violation> violations) {
		this.violations = violations;
	}

}
