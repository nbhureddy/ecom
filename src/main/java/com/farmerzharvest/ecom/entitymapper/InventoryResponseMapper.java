package com.farmerzharvest.ecom.entitymapper;

import com.farmerzharvest.ecom.dto.InventoryResponse;
import com.farmerzharvest.ecom.dto.InventoryResponse.InventoryItem;
import com.farmerzharvest.ecom.model.product.Inventory;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;

public class InventoryResponseMapper {

  public InventoryResponse mapToProductResponse(List<Inventory> inventoryList) {
    if (!CollectionUtils.isEmpty(inventoryList)) {
      List<InventoryItem> items = inventoryList.stream()
          .map(this::buildInventoryItem)
          .collect(Collectors.toList());
      return new InventoryResponse(items);
    }
    return new InventoryResponse();
  }

  private InventoryItem buildInventoryItem(Inventory inventory) {
    return InventoryItem.builder()
        .productId(inventory.getProduct().getId())
        .productName(inventory.getProduct().getName())
        .unitType(inventory.getProduct().getProductUnits().getUnitType())
        .minQuantity(inventory.getProduct().getProductUnits().getUnitQuantity())
        .imageUrl(inventory.getProduct().getImageUrl())
        .productCategory(inventory.getProduct().getCategory().getCategoryName())
        .unitPrice(inventory.getUnitPrice())
        .totalAvailableUnits(inventory.getTotalQuantity())
        .build();
  }
}
