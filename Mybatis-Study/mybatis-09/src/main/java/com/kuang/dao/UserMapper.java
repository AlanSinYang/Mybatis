package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    //根据ID查询用户
   User queryUserById(@Param("id") int id);


    //修改用户,返回Int
    int updateUser(User user);
}
