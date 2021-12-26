package com.hean.serverclint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServerclintApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerclintApplication.class, args);
    }

}
