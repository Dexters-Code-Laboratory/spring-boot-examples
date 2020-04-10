package com.springboot.example.springbootexamples.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "school")
public class School {

    @Id
    @Column(name = "id",nullable = false)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

//    @OneToMany(fetch = FetchType.LAZY)
//    private List<School> schoolList;

}