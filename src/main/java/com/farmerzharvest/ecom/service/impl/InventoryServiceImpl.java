package com.farmerzharvest.ecom.service.impl;

import com.farmerzharvest.ecom.dto.InventoryResponse;
import com.farmerzharvest.ecom.entitymapper.InventoryResponseMapper;
import com.farmerzharvest.ecom.model.product.Inventory;
import com.farmerzharvest.ecom.repository.InventoryRepository;
import com.farmerzharvest.ecom.service.InventoryService;
import java.util.List;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {
  private final InventoryRepository inventoryRepository;

  private InventoryResponseMapper inventoryResponseMapper;

  @PostConstruct
  public void setup() {
    inventoryResponseMapper = new InventoryResponseMapper();
  }

  @Override
  public InventoryResponse getInventory(String categoryName) {

    if (StringUtils.isEmpty(categoryName)) {
      List<Inventory> inventories = inventoryRepository.findAll();
      return inventoryResponseMapper.mapToProductResponse(inventories);
    }
    List<Inventory> inventories = inventoryRepository.findAllByProduct_Category_categoryName(categoryName);
    return inventoryResponseMapper.mapToProductResponse(inventories);
  }
}
