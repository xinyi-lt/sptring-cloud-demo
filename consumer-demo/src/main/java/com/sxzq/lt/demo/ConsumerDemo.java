package com.sxzq.lt.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by july on 2018/7/11.
 *
 * http://localhost:9003/consumer/demo?name=lily
 */
@RestController
public class ConsumerDemo {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer/demo")
    public String consumerControllerDemo(@RequestParam String name){
        return consumerService.consumerDemo(name);
    }
}
