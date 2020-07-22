/**
 * 
 */
package com.hotel.master.role;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author User
 *
 */
@RestController
@RequestMapping("/api/role")
public class RoleResource {
	
	@RequestMapping("all")
	public void all() {
		
	}

}
