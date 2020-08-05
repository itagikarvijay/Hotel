/**
 * 
 */
package com.hotel.master.customer;

/**
 * @author User
 *
 */
public class Violation {

	private String filed;
	private String message;

	public Violation(String filed, String message) {
		this.filed = filed;
		this.message = message;
	}

	/**
	 * @return the filed
	 */
	public String getFiled() {
		return filed;
	}

	/**
	 * @param filed the filed to set
	 */
	public void setFiled(String filed) {
		this.filed = filed;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Violation [filed=" + filed + ", message=" + message + "]";
	}
	
}
