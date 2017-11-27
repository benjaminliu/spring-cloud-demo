package com.ben.demo.data.consumer.controller;

import com.ben.demo.data.consumer.feign.UserServiceProxy;
import com.ben.demo.data.provider.api.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ben on 2017/11/27.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceProxy userService;

    @RequestMapping("/{id}")
    public UserDto getUserById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }
}