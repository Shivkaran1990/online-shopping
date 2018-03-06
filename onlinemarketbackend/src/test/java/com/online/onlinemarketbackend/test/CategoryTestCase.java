package com.online.onlinemarketbackend.test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.online.onlinemarketbackend.dao.CategoryDAO;
import com.online.onlinemarketbackend.dto.Category;


public class CategoryTestCase {
private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.online.onlinemarketbackend.daoimpl");
		context.scan("com.online.onlinemarketbackend.config"); 
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("this is very good TV");
		category.setImageURL("CAT_1.png");
		category.setActive(true);
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
		
	}
}
