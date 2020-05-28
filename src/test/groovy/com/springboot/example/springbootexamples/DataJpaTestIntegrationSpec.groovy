package com.springboot.example.springbootexamples

import com.springboot.example.springbootexamples.domain.School
import com.springboot.example.springbootexamples.repository.SchoolRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import spock.lang.Specification

@DataJpaTest
class DataJpaTestIntegrationSpec extends Specification{

    @Autowired
    TestEntityManager entityManager

    @Autowired
    SchoolRepository schoolRepository

    def "persist school object"(){
        given: "some schools"
        entityManager.persist(new School(name: "MPS",id: 512))
        entityManager.persist(new School(name: "CKPS",id: 514))

        expect: "count object"
        schoolRepository.count() == 2
    }
}
