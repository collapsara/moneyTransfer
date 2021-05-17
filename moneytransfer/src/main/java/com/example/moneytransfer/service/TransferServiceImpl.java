package com.example.moneytransfer.service;

import com.example.moneytransfer.dao.TransferDao;
import com.example.moneytransfer.entity.Transfer;
import com.example.moneytransfer.repository.AccountRepository;
import com.example.moneytransfer.repository.TransferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransferServiceImpl implements TransferService{

    private final AccountRepository accountRepository;
    private final TransferRepository transferRepository;

    @Override
    public Transfer transfer(Transfer transfer) {
        return transferRepository.save(transfer);
    }

    @Override
    public List<Transfer> getAll() {
        return transferRepository.findAll();
    }


}
