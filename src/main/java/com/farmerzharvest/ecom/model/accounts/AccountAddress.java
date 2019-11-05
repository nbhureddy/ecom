package com.farmerzharvest.ecom.model.accounts;

import com.farmerzharvest.ecom.model.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AccountAddress extends BaseEntity {

  @Id
  private Long id;

  @ManyToOne
  @JoinColumn(name = "account_id")
  private Account account;

  private String addressLine1;
  private String addressLine2;
  private String city;
  private String state;
  private Long pinCode;
}
