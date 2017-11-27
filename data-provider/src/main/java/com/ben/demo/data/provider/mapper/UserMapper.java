package com.ben.demo.data.provider.mapper;

import com.ben.demo.data.provider.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by ben on 2017/11/27.
 */
@Mapper
public interface UserMapper {
    @Select({"select id, user_name userName,tel from user_ where id = #{id } "})
    User selectByid(Long id);
}
