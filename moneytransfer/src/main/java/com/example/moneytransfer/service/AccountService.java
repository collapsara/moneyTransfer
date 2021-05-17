package com.example.moneytransfer.service;

import com.example.moneytransfer.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountService {

    Account addNewAccount(Account account);

    List<Account> getAll();
}
