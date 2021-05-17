package com.example.moneytransfer.service;

import com.example.moneytransfer.entity.Account;
import com.example.moneytransfer.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Account addNewAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }
}
