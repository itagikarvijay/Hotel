/**
 * 
 */
package com.hotel.rooms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author User
 *
 */
@RestController
@RequestMapping("/api/room")
public class RoomsReource {

	@Autowired
	IRoomsService roomsService;

	@RequestMapping("/rooms")
	public List<RoomsDTO> getAll() {
		return roomsService.getAll();
	}
}
