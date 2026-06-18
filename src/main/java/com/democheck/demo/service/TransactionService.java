package com.democheck.demo.service.impl;

import com.democheck.demo.dto.TransactionHistoryResponse;
import com.democheck.demo.dto.TransactionRequest;
import com.democheck.demo.dto.TransactionResponse;

import java.util.List;

public interface TransactionService {
    TransactionResponse createTransaction(
            TransactionRequest request
    );
    TransactionResponse getTransaction(String transactionId);
    List<TransactionHistoryResponse> getTransactionHistory(Long userId);
}
