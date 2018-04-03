package com.online.onlinemarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.online.onlinemarketbackend.dao.ProductDAO;
import com.online.onlinemarketbackend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	@Autowired
	private ProductDAO productDAO;

	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts()
	{
		System.out.print("");
		System.out.print("");
		System.out.print("");
		System.out.print("");
		return productDAO.listActiveProducts();        
	}
	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getProductsByCategory(@PathVariable int id) {
		System.out.print("");
		System.out.print("");
		System.out.print("");
		System.out.print("");	
		return productDAO.listActiveProductsByCategory(id);
				
	}
}
