package com.example.moneytransfer.controller;

import com.example.moneytransfer.entity.Account;
import com.example.moneytransfer.entity.Transfer;
import com.example.moneytransfer.service.AccountService;
import com.example.moneytransfer.service.TransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    List<Account> getAll(){
        return accountService.getAll();
    }

    @PostMapping
    Account addNewAccount(@RequestBody Account account){
        return accountService.addNewAccount(account);
    }
}