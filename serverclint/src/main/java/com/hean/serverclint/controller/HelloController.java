package com.hean.serverclint.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：jyx
 * @description：
 * @date ：Created in 2021/12/23 10:09
 */
@RefreshScope
@RestController
public class HelloController {

    @Value("${configType}")
    private String config;

    @RequestMapping("/hello")
    public String from() {
        return this.config;
    }

}
