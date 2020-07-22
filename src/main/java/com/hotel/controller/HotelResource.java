package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.mapper.MapperClz;
import com.hotel.service.IHotelService;

@RestController
@RequestMapping("/api")
public class HotelResource {

	@Autowired
	IHotelService schoolService;

	@Autowired
	MapperClz mapperClz;

//	@GetMapping("/schoolDetails")
//	public ResponseEntity<HotelDTO> getSchool() {
//		HttpHeaders headers = new HttpHeaders();
//		return new ResponseEntity<>(mapperClz.convertToDto(schoolService.getSchool().get()), headers, HttpStatus.OK);
//	}


	@GetMapping("/someText")
	public String getSomeText() {
		return "SomeText";
	}
}
