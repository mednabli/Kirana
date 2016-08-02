package com.med.kirana.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.med.kirana.forms.ProductForm;
import com.med.kirana.services.ProductService;
import com.med.kirana.utility.MediaUtils;

@Controller
@RequestMapping("productForm")
public class ProductFormPageController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String productForm(Model model){
		model.addAttribute("product",new ProductForm());
		return "productform";
	}
	
	@RequestMapping(value="addProduct",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") ProductForm product,Model model,RedirectAttributes redirectAttributes,HttpServletRequest request) throws IOException{
		
		File imagesDir = new File(MediaUtils.getProductsMediaFolder());
		if (!imagesDir.exists()){imagesDir.mkdirs();}
		
		MultipartFile  file=product.getImages()[0];
		
		File productImage = new File(imagesDir.getAbsolutePath()
				+ File.separator + file.getOriginalFilename());
		
		byte[] bytes = file.getBytes();
		System.out.println(productImage.getName());
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(productImage));
		stream.write(bytes);
		stream.close();
//		NotificationMessage notificationMessage =  new NotificationMessage();
//		try{
//			
//			product = productService.saveProduct(product);
//			notificationMessage.setMessage("Product has been added succesfuly - Product ID : "+product.getId());
//			notificationMessage.setType(NotificationMessage.SUCCESS );
//			
//		}catch(Exception e){
//			notificationMessage.setMessage(e.getMessage());
//			notificationMessage.setType(NotificationMessage.ERROR);
//			
//		}
//		redirectAttributes.addFlashAttribute("notificationMessage", notificationMessage);
		return "redirect:/products";
	}

	
	protected ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	
}
