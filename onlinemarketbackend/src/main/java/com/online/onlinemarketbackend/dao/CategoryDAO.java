package com.online.onlinemarketbackend.dao;
import java.util.List;

import com.online.onlinemarketbackend.dto.Category;
public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);
	
	boolean add(Category category);
	

}
