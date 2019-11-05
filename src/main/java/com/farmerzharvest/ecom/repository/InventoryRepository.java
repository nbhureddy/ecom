package com.farmerzharvest.ecom.repository;

import com.farmerzharvest.ecom.model.product.Inventory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
  List<Inventory> findAllByProduct_Category_categoryName(String category);
}
