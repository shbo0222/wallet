package com.democheck.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long walletId;
    //private Long userId;
    private BigDecimal balance;
    private BigDecimal weeklyLimit;
    @Version
    private Long version;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
