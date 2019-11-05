package com.farmerzharvest.ecom.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponse {
  private List<InventoryItem> inventoryItems;

  @Getter
  @Setter
  @Builder
  public static class InventoryItem {
    private Long productId;
    private String productName;
    private String imageUrl;
    private String productCategory;
    private String unitType;
    private Long minQuantity;
    private Double unitPrice;
    private Long totalAvailableUnits;
  }
}
