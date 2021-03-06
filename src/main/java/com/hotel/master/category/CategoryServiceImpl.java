package com.hotel.master.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.mapper.MapperClz;

@Service
public class CategoryServiceImpl implements ICategoryService {
	
	@Autowired
	ICategoryRepo categoryRepo;
	
	@Autowired
	MapperClz mapperClz;

	@Override
	public List<CategoryDTO> findAll() {
		return mapperClz.convertToDto(categoryRepo.findAll());
	}
	
}
