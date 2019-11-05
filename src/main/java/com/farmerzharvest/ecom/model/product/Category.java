package com.farmerzharvest.ecom.model.product;

import com.farmerzharvest.ecom.model.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Category extends BaseEntity {

  @Id
  private Long id;
  private String categoryName;
  private String description;
}
