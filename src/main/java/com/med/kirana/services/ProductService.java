package com.med.kirana.services;

import java.util.List;

import com.med.kirana.models.Product;

public interface ProductService {

	Product saveProduct(Product product);

	List<Product> getAllProducts();

}
