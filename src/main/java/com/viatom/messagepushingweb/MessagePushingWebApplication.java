package com.viatom.messagepushingweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.viatom.messagepushingweb.mapper")
public class MessagePushingWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessagePushingWebApplication.class, args);
    }

}
