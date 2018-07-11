package com.sxzq.lt.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by july on 2018/7/5.
 */
@RestController
@RequestMapping("/spring")
public class ProviderDemo {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String eurekaProviderDemo(@RequestParam String name){
        return "hello " + name;
    }
}
