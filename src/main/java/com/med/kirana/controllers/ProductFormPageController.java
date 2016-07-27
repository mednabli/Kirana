package com.med.kirana.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.med.kirana.models.Product;
import com.med.kirana.services.ProductService;
import com.med.kirana.utility.NotificationMessage;

@Controller
@RequestMapping("productForm")
public class ProductFormPageController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String productForm(Model model){
		model.addAttribute("product",new Product());
		return "productform";
	}
	
	@RequestMapping(value="addProduct",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product,Model model,RedirectAttributes redirectAttributes){
		
		NotificationMessage notificationMessage =  new NotificationMessage();
		try{
			
			product = productService.saveProduct(product);
			notificationMessage.setMessage("Product has been added succesfuly - Product ID : "+product.getId());
			notificationMessage.setType(NotificationMessage.SUCCESS );
			
		}catch(Exception e){
			notificationMessage.setMessage(e.getMessage());
			notificationMessage.setType(NotificationMessage.ERROR);
			
		}
		redirectAttributes.addFlashAttribute("notificationMessage", notificationMessage);
		return "redirect:/products";
	}

	
	protected ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	
}
