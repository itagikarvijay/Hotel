/**
 * 
 */
package com.hotel.rooms;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hotel.dto.BaseDTO;
import com.hotel.master.category.CategoryDTO;

/**
 * @author User
 *
 */

public class RoomsDTO extends BaseDTO {

	private Integer id;
	private CategoryDTO category;

	private String name;
	private String status;

	private Float rate;

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
	 * @return the categoryId
	 */
	public CategoryDTO getCategory() {
		return category;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategory(CategoryDTO category) {
		this.category = category;
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
	 * @return the rate
	 */
	public Float getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(Float rate) {
		this.rate = rate;
	}

	/**
	 * @return the roomStatus
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param roomStatus the roomStatus to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
