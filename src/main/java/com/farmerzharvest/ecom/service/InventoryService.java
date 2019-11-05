package com.farmerzharvest.ecom.service;

import com.farmerzharvest.ecom.dto.InventoryResponse;

public interface InventoryService {
  InventoryResponse getInventory(String categoryName);
}
