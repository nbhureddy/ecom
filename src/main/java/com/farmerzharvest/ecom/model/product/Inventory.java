package com.farmerzharvest.ecom.model.product;

import com.farmerzharvest.ecom.model.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Inventory extends BaseEntity {

  @Id
  private Long id;

  @OneToOne
  @JoinColumn(name = "product_id")
  private Product product;

  private Long totalQuantity;

  private Double unitPrice;

  private boolean isActive;
}
