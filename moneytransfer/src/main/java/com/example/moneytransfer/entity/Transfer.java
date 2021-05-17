package com.example.moneytransfer.entity;

import com.example.moneytransfer.enums.OperationType;
import lombok.*;
import javax.persistence.*;

/*
Request:
- sourceId: transfering from account id
- targetId: transfering to account id
- amount: amount of transfer
- orderId: each external system sends unique transaction id
- webhookUrl: each external system sends url, our system has to callback status of operation
- operationType: BLOCK, MAKETRN, UNBLOCK

history of transactions
* */
@Entity
@Setter
@Getter
@Table(name = "transfer")
@RequiredArgsConstructor
@NoArgsConstructor
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transfer_id")
    private Long transfer_id;

    @NonNull
    @Column(name = "source_id")
    private Long source_id;

    @NonNull
    @Column(name = "target_id")
    private Long target_id;

    @NonNull
    @Column(name = "amount")
    private Long amount;

    @NonNull
    @Column(name = "order_id")
    private String orderId;

    @NonNull
    @Column(name = "webhook_url")
    private String webhookUrl;

    @NonNull
    @Column(name =  "operation_type")
    private OperationType operationType;
}
