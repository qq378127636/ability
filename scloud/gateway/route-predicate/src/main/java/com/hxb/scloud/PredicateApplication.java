package com.hxb.scloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PredicateApplication {

    public static void main(String[] args) {
        SpringApplication.run(PredicateApplication.class, args);
    }
}
