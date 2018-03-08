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
		context.scan("com.online.onlinemarketbackend");
		//context.scan("com.online.onlinemarketbackend.config"); 
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	/*@Test
	public void testAddCategory() {	
		category = new Category();		
		category.setName("Laptop");
		category.setDescription("this is very good loptop");
		category.setImageURL("CAT_3.png");
		category.setActive(true);
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
	}*/
	
	/*@Test
	public void testGetCategory() {	
		category = categoryDAO.get(1);
		assertEquals("Successfully fatched a category inside the table!",1,category.getId());
	}*/
	/*@Test
	public void testUpdateCategory() {	
		category = categoryDAO.get(5);
		category.setImageURL("CAT_5.png");		
		assertEquals("Successfully fatched a category inside the table!",true,categoryDAO.update(category));
	}*/
/*	@Test
	public void testDeleteCategory() {	
		category = categoryDAO.get(2);
		category.setActive(false);
		assertEquals("Successfully fatched a category inside the table!",true,categoryDAO.update(category));
	}*/
	@Test
	public void testListCategory() {	
		assertEquals("Successfully fatched a category List",4,categoryDAO.list().size());
	}

}
