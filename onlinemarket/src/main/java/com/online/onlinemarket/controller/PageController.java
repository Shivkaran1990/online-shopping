package com.online.onlinemarket.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.online.onlinemarket.exception.ProductNotFoundException;
import com.online.onlinemarketbackend.dao.CategoryDAO;
import com.online.onlinemarketbackend.dao.ProductDAO;
import com.online.onlinemarketbackend.dto.Category;
import com.online.onlinemarketbackend.dto.Product;

@Controller
public class PageController {
	private static final Logger logger=LoggerFactory.getLogger(PageController.class);
	@Autowired
	private CategoryDAO categoryDAO;
	@Autowired
	private ProductDAO productDAO;
	@RequestMapping(value={"/","/homepage","/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		logger.info("This is for Info Msg");
		logger.debug("This is for Debug Msg");
		mv.addObject("userClickHome",true);
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value={"/about"})
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	@RequestMapping(value={"/contact"})
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	@RequestMapping(value={"/show/all/products"})
	public ModelAndView showAllProducts()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Product");
		mv.addObject("userClickAllProducts",true);
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	@RequestMapping(value={"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{
		ModelAndView mv=new ModelAndView("page");
		
		Category category=null;
		category=categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		mv.addObject("category",category);
		mv.addObject("userClickCategoryProducts",true);
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value={"/show/{id}/product"})
	public ModelAndView showSingleProduct(@PathVariable("id") int id) throws ProductNotFoundException
	{
		ModelAndView mv=new ModelAndView("page");
		Product product=productDAO.get(id);
		if(product==null)
			throw new ProductNotFoundException();
		product.setViews(product.getViews()+1);
		productDAO.update(product);
		mv.addObject("title",product.getName());
		mv.addObject("product",product);
		mv.addObject("userClickShowProduct",true);
		return mv;
	}
	
	
}
