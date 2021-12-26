package com.hean.msg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：jyx
 * @description：
 * @date ：Created in 2021/12/23 10:09
 */
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String index(@RequestParam("id") Integer id) {
        return "msg-producer get id [" + id + "]";
    }

}
