package com.farmerzharvest.ecom.model.order;

import com.farmerzharvest.ecom.model.BaseEntity;
import com.farmerzharvest.ecom.model.accounts.Account;
import com.farmerzharvest.ecom.model.accounts.AccountAddress;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Orders extends BaseEntity {

  @Id
  private Long id;

  @ManyToOne
  @JoinColumn(name = "account_id")
  private Account account;

  @ManyToOne
  @JoinColumn(name = "address_id")
  private AccountAddress accountAddress;

  private Double totalAmount;
  private LocalDateTime orderDate;

  @OneToMany(mappedBy = "orderId")
  private List<OrderDetails> orderDetails;
}


