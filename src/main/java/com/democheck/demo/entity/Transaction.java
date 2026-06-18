package com.democheck.demo.entity;

import com.democheck.demo.dto.TransactionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String transactionId;
    private Long senderWalletId;
    private Long receiverWalletId;
    private BigDecimal amount;
    private TransactionStatus status;
    private LocalDate createdAt;
    @ManyToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;

    @ManyToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;
}
