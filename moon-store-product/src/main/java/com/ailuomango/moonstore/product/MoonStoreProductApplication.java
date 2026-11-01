package com.ailuomango.moonstore.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ailuomango.moonstore.product.dao")
@SpringBootApplication
public class MoonStoreProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoonStoreProductApplication.class, args);
    }
}
