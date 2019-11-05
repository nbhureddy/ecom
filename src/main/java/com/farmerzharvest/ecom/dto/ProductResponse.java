package com.farmerzharvest.ecom.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductResponse {

  private Long id;
  private String name;
  private String description;
  private String imageUrl;
  private ProductDetail productDetail;

  @Setter
  @Getter
  @Builder
  public static class ProductDetail {
    private String category;
    private String unitType;
    private Long unitQuantity;
    private Double pricePerUnit;
    private Long totalQuantity;
    private boolean isActive;
  }
}

