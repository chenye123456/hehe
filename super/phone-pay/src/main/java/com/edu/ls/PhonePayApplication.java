package com.edu.ls;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class PhonePayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhonePayApplication.class, args);
    }

}
