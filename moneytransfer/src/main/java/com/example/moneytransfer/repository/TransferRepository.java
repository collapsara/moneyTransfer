package com.example.moneytransfer.repository;

import com.example.moneytransfer.entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Long> {

}
