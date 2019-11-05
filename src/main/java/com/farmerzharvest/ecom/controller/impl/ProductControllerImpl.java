package com.farmerzharvest.ecom.controller.impl;

import com.farmerzharvest.ecom.controller.ProductController;
import com.farmerzharvest.ecom.dto.ProductResponse;
import com.farmerzharvest.ecom.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "products", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ProductControllerImpl implements ProductController {

  private final ProductService productService;

  @GetMapping
  public List<ProductResponse> getProducts() {
    return productService.getProducts();
  }

  @GetMapping("/{productId}")
  public ProductResponse getProduct(@PathVariable Long productId) {
    return productService.getProduct(productId);
  }

}
