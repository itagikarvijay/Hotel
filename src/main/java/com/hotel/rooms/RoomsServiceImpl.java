/**
 * 
 */
package com.hotel.rooms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.mapper.MapperClz;

/**
 * @author User
 *
 */
@Service
public class RoomsServiceImpl implements IRoomsService {

	@Autowired
	MapperClz<?> mapperClz;

	@Autowired
	IRoomsRepo roomsRepo;

	@Override
	public List<RoomsDTO> getAll() {
		return mapperClz.convertToDto(roomsRepo.findAll());
	}

}
