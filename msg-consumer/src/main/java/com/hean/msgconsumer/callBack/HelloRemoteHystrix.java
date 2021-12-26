package com.hean.msgconsumer.callBack;

import com.hean.msgconsumer.service.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：jyx
 * @description：
 * @date ：Created in 2021/12/23 17:24
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "id") Integer id) {

        return "hello service is called with failed";
    }

}
