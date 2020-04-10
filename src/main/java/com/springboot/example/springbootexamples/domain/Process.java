package com.springboot.example.springbootexamples.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "process")
public class Process {

    @Id
    @Column(name = "process_id",nullable = false)
    private String id;

    @Column(name = "transaction_id", nullable = false)
    private String transactionId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "process")
    private List<WorkObject> workObject;

}