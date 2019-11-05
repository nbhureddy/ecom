package com.farmerzharvest.ecom.repository;

import com.farmerzharvest.ecom.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
