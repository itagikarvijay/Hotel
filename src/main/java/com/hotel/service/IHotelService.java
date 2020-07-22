package com.hotel.service;

import java.util.Optional;

import com.hotel.entity.HotelEntity;

public interface IHotelService {
	
	public Optional<HotelEntity> getHotel();

}
