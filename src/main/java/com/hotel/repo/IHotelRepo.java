package com.hotel.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.entity.HotelEntity;

@Repository
public interface IHotelRepo extends CrudRepository<HotelEntity,Integer> {

}
