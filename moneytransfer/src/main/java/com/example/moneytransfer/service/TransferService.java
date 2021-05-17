package com.example.moneytransfer.service;

import com.example.moneytransfer.dao.TransferDao;
import com.example.moneytransfer.entity.Transfer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransferService {

    Transfer transfer(Transfer transfer);

    List<Transfer> getAll();
}
