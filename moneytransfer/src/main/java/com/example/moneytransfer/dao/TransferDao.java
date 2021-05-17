package com.example.moneytransfer.dao;

import com.example.moneytransfer.enums.OperationType;
import lombok.Getter;
import lombok.Setter;

/*
- sourceId: transfering from account id
- targetId: transfering to account id
- amount: amount of transfer
- orderId: each external system sends unique transaction id
- webhookUrl: each external system sends url, our system has to callback status of operation
- operationType: BLOCK, MAKETRN, UNBLOCK
* */
@Getter
@Setter
public class TransferDao {
    private Long sourceId;
    private Long targetId;
    private Long amount;
    private String orderId;
    private String webhookUrl;
    private OperationType operationType;
}

