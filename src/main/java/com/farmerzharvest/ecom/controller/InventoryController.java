package com.farmerzharvest.ecom.controller;

import com.farmerzharvest.ecom.dto.InventoryResponse;

public interface InventoryController {

  InventoryResponse getInventory(String categoryName);

//  InventoryResponse getInventoryByCategory(String categoryName);
}
