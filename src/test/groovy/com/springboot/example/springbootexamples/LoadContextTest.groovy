package com.springboot.example.springbootexamples;

import com.springboot.example.springbootexamples.controller.WebController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest;
import spock.lang.Specification;

@SpringBootTest
class LoadContextTest extends Specification {

    @Autowired(required = false)
    private WebController webController

    def "when all context is loaded then all expected beans are created"() {
        expect: "web controller is created"
        webController
    }

    def "canary test"(){
        expect:
        true
    }
}
