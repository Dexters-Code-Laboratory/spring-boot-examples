package com.springboot.example.springbootexamples.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "transaction_contract")
public class TransactionContract {

    @Id
    @Column(name = "transaction_id",nullable = false)
    private String transactionId;

    @Column(name = "transaction_status")
    private String transactionStatus;

}