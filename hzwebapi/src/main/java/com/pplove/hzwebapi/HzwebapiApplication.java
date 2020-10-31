package com.pplove.hzwebapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.pplove.hzwebapi.mapper")
@SpringBootApplication
public class HzwebapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzwebapiApplication.class, args);
    }

}
