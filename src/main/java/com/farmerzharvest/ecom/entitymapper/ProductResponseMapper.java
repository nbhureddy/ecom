package com.farmerzharvest.ecom.entitymapper;

import com.farmerzharvest.ecom.dto.ProductResponse;
import com.farmerzharvest.ecom.model.product.Product;
import java.util.function.Function;

public class ProductResponseMapper implements Function<Product, ProductResponse> {

  public ProductResponse apply(Product product) {
    ProductResponse.ProductResponseBuilder builder = ProductResponse.builder()
        .id(product.getId())
        .description(product.getDescription())
        .name(product.getName())
        .imageUrl(product.getImageUrl());

    if (product.getProductUnits() != null) {
      ProductResponse.ProductDetail productDetail
          = ProductResponse.ProductDetail.builder()
          .category(product.getCategory().getCategoryName())
          .unitQuantity(product.getProductUnits().getUnitQuantity())
          .unitType(product.getProductUnits().getUnitType())
          .build();

      builder.productDetail(productDetail);
    }

    return builder.build();
  }
}
