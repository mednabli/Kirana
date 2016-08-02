package com.med.kirana.converters;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.med.kirana.forms.ProductForm;
import com.med.kirana.models.Product;
import com.med.kirana.models.ProductImage;
import com.med.kirana.utility.MediaUtils;

@Component
public class ProductConverter implements Converter<ProductForm, Product> {

	@Override
	public Product convert(ProductForm source) {
		return null;
	}

	private List<ProductImage> createImages(MultipartFile[] images){
		
		List<ProductImage> productImages=new ArrayList<>();
		for (MultipartFile image : images) {
			ProductImage productImage=new ProductImage();
			productImage.setId(new Date().getTime()+"");
			productImage.setRealPath(MediaUtils.getProductsMediaFolder()+File.separator+productImage.getId()+".jpg");
			productImage.setRealName(image.getOriginalFilename());
			productImages.add(productImage);
		}
		return productImages;
	}
	
}
