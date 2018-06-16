package com.online.onlinemarket.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.online.onlinemarketbackend.dao.CategoryDAO;
import com.online.onlinemarketbackend.dto.Category;
import com.online.onlinemarketbackend.dto.Product;

@Controller
@RequestMapping("/manage")
public class AdminController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView manageProduct() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickedManageProduct", true);
		mv.addObject("title", "Manage Proudcts");
		Product product = new Product();
		product.setSupplierId(1);
		product.setActive(true);
		mv.addObject("product", product);
		return mv;
	}

	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	@ResponseBody
	public List<Category> getCategoriesList() {
		return categoryDAO.list();
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	@ResponseBody
	public String  addCategory(@RequestBody String data) {
		
				JSONParser parser = new JSONParser();
				Category cat=new Category();
		try {
			JSONObject json = (JSONObject) parser.parse(data);
			//System.out.println(json);
			
			cat.setActive(false);
			if(json.get("isactive").equals("on"))
			{
				cat.setActive(true);
			}
			cat.setActive(true);
			cat.setName(json.get("categoryname").toString());
			cat.setDescription(json.get("Discription").toString());
			cat.setImageURL(json.get("fileid").toString());
	        categoryDAO.add(cat);
	      //  return "";
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categoryDAO.list().toString();
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	@ResponseBody
    public String updateHosting(@RequestBody String hostingForm) {
		
		System.out.println(hostingForm);

		return "";
    }
	
}
