package com.med.kirana.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.med.kirana.services.ProductService;

@Controller
public class ProductsManagementPageController {

	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(value="products",method=RequestMethod.GET)
	public String productsManagementPage(Model model){
		model.addAttribute("products",productService.getAllProducts());
		return "productsmanagement";
	}
}
