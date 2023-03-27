package com.tothefor.retrydemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RetryDemoApplicationTests {

    @Autowired
    private DemoService demoService;

    @Test
    void contextLoads() {
        demoService.message();
        System.out.println(demoService.getAll(3));
    }

}
