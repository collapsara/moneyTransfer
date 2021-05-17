package com.example.moneytransfer.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "account")
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long account_id;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "email")
    private String email;

    @Column(name = "fio")
    private String fio;

    @Column(name = "money")
    private long money;
}
