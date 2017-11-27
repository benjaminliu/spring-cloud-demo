package com.ben.demo.data.consumer.controller;

import com.ben.demo.data.consumer.feign.HelloServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ben on 2017/11/27.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloServiceProxy helloService;

    @RequestMapping("/hello")
    public String hello() {
        //  return "adsf";
        return helloService.hello();
    }
}
