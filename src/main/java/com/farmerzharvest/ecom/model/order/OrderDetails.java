package com.farmerzharvest.ecom.model.order;

import com.farmerzharvest.ecom.model.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderDetails extends BaseEntity {
  @Id
  private Long id;
  private Long productId;

  private Long orderId;

  private Long units;
  private Double pricePerUnit;
  private Double totalAmount;
}
