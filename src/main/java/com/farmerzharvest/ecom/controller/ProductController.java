package com.farmerzharvest.ecom.controller;

import com.farmerzharvest.ecom.dto.ProductResponse;
import java.util.List;

public interface ProductController {

  List<ProductResponse> getProducts();

  ProductResponse getProduct(Long productId);
}
