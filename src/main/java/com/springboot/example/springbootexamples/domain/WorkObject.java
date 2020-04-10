package com.springboot.example.springbootexamples.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "work_object")
public class WorkObject {

    @Id
    @Column(name = "transaction_id",nullable = false)
    private String transactionId;

    private String test;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id")
    private TransactionContract transactionDetails;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "process_id")
    private Process process;

}