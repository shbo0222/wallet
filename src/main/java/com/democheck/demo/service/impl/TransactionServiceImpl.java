package com.democheck.demo.service;

import com.democheck.demo.dto.TransactionHistoryResponse;
import com.democheck.demo.dto.TransactionRequest;
import com.democheck.demo.dto.TransactionResponse;
import com.democheck.demo.entity.Wallet;
import com.democheck.demo.repository.TransactionRepository;
import com.democheck.demo.repository.WalletRepository;
import com.democheck.demo.service.impl.TransactionService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TransactionServiceImpl implements TransactionService {
    private TransactionRepository transactionRepository;
    private WalletRepository walletRepository;

    @Override
    public TransactionResponse createTransaction(TransactionRequest request) {
        Wallet wallet = walletRepository.
                findByUserUserId(request.getUserId())
                .orElseThrow(()-> new RuntimeException("Wallet Not Found!!"));
    }

    @Override
    public TransactionResponse getTransaction(String transactionId) {
        return null;
    }

    @Override
    public List<TransactionHistoryResponse> getTransactionHistory(Long userId) {
        return List.of();
    }
}
