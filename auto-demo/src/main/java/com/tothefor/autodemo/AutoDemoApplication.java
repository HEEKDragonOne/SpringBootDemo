package com.tothefor.autodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class AutoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoDemoApplication.class, args);
    }

}
