package com.hean.msg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsgProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsgProducerApplication.class, args);
    }

}
