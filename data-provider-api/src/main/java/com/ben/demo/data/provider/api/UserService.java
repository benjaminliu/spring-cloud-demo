package com.ben.demo.data.provider.api;

import com.ben.demo.data.provider.api.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ben on 2017/11/27.
 */
@RequestMapping("/user")
public interface UserService {
    @RequestMapping("/id")
    UserDto getById(@RequestParam("id") Long id);
}
