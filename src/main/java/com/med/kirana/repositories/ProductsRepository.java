package com.med.kirana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.med.kirana.models.Product;


public interface ProductsRepository extends JpaRepository<Product,Integer> {

}
