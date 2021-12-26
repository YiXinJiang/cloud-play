package com.hean.msgconsumer.controller;

import com.hean.msgconsumer.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：jyx
 * @description：
 * @date ：Created in 2021/12/23 16:05
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloRemote HelloRemote;

    @RequestMapping("/index")
    public String index(@RequestParam("id") Integer id) {

        return HelloRemote.hello(id);
    }

}
