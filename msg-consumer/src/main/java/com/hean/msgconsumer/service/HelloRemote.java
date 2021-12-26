package com.hean.msgconsumer.service;

import com.hean.msgconsumer.callBack.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：jyx
 * @description：
 * @date ：Created in 2021/12/23 16:03
 */
@FeignClient(name = "msg-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/msgProducer/index")
    String hello(@RequestParam(value = "id") Integer id);

}
