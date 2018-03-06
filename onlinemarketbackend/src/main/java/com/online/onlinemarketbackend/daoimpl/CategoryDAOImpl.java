package com.online.onlinemarketbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.online.onlinemarketbackend.dao.CategoryDAO;
import com.online.onlinemarketbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private static List<Category> categories=new ArrayList<>();
	static
	{
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is very good TV");
		category.setImageURL("CAT_1.png");
		category.setActive(true);
		categories.add(category);
		
		//2
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Mbile");
		category2.setDescription("this is very good Mbile");
		category2.setImageURL("CAT_2.png");
		category2.setActive(true);
		categories.add(category2);
		
		//3
		Category category3=new Category();
		category3.setId(3);
		category3.setName("Freez");
		category3.setDescription("this is very good Freez");
		category3.setImageURL("CAT3.png");
		category3.setActive(true);
		categories.add(category3);
		
		//4
		Category category4=new Category();
		category4.setId(4);
		category4.setName("Laptop");
		category4.setDescription("this is very good Laptop");
		category4.setImageURL("CAT_4.png");
		category4.setActive(true);
		categories.add(category4);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category cat:categories)
		{
			if(cat.getId()==id)
			{
				return cat;
			}
		}
		
		return null;
	}

	@Override
	@Transactional
	public boolean add(Category category) {
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
