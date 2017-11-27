package com.ben.demo.data.provider.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ben on 2017/11/27.
 */
@RequestMapping("/helloService")
public interface HelloService {
    @Autowired
    @RequestMapping("/hello")
    String hello();
}
