package com.hotel.master.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryResource {
	
	@Autowired
	ICategoryService categoryService;
	
	@RequestMapping("/categories")
	public List<CategoryDTO> getAll(){
		return categoryService.findAll();
	}

}
