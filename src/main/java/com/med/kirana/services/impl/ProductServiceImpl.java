package com.med.kirana.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.kirana.models.Product;
import com.med.kirana.repositories.ProductsRepository;
import com.med.kirana.services.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Resource
	private ProductsRepository productsRepository;

	@Override
	public Product saveProduct(Product product){
		 return productsRepository.save(product);
	}
	
	@Override
	public List<Product> getAllProducts(){
		return productsRepository.findAll();
	}
	
}
