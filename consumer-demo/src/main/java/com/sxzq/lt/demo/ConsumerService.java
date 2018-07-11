package com.sxzq.lt.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by july on 2018/7/11.
 */
@FeignClient("provider-demo")
public interface ConsumerService {

    @RequestMapping(value = "/spring/demo", method = RequestMethod.GET)
    String consumerDemo(@RequestParam(value = "name") String name);
}
