package com.farmerzharvest.ecom.model.accounts;

import com.farmerzharvest.ecom.model.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Account extends BaseEntity {

  @Id
  private Long id;

  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
}
