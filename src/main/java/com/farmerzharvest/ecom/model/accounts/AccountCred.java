package com.farmerzharvest.ecom.model.accounts;

import com.farmerzharvest.ecom.model.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AccountCred extends BaseEntity {

  @Id
  private Long id;

  @OneToOne
  @JoinColumn(name = "account_id")
  private Account account;
  private String encryptedPassword;
}
