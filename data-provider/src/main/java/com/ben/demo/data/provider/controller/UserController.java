package com.ben.demo.data.provider.controller;

import com.ben.demo.data.provider.api.UserService;
import com.ben.demo.data.provider.api.dto.UserDto;
import com.ben.demo.data.provider.entity.User;
import com.ben.demo.data.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ben on 2017/11/27.
 */
@RestController
public class UserController implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto getById(@RequestParam("id") Long id) {
        User user = userMapper.selectByid(id);
        UserDto u = new UserDto();
        u.setTel(user.getTel());
        u.setUserName(user.getUserName());
        return u;
    }
}