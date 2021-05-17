package com.example.moneytransfer.controller;

import com.example.moneytransfer.dao.TransferDao;
import com.example.moneytransfer.entity.Transfer;
import com.example.moneytransfer.service.TransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("transfer")
@RequiredArgsConstructor
public class TransferController {

    private final TransferService transferService;

    @GetMapping
    List<Transfer> getAll(){
        return transferService.getAll();
    }

    @PostMapping
    Transfer transfer(@RequestBody Transfer transfer){
        return transferService.transfer(transfer);
    }
}
