package com.hotel.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.HotelEntity;
import com.hotel.repo.IHotelRepo;

@Service
public class HotelService implements IHotelService {
	
	@Autowired
	IHotelRepo hotelRepo;

	@Override
	public Optional<HotelEntity> getHotel() {
		
		return hotelRepo.findById(1);
	}
	

}
