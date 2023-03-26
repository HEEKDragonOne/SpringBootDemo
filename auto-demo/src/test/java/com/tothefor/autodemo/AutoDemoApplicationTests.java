package com.tothefor.autodemo;

import com.tothefor.autodemo.autowired.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AutoDemoApplicationTests {

    @Resource(name = "mapperImpl")
    private Mapper mapper;

    @Test
    void contextLoads() {
        System.out.println(mapper);
        mapper.show();
    }

}
