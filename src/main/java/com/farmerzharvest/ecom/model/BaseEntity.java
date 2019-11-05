package com.farmerzharvest.ecom.model;

import java.time.LocalDateTime;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
  private LocalDateTime createdAt;
  private Long createdBy;
  private LocalDateTime updatedAt;
  private Long updatedBy;
}
