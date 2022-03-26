package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from users")
    List<User> getUsers();


    //查询,方法存在多个参数,所有的参数前面必须加上@Param("id")注解
    @Select("select * from users where uid = #{uid}")
    User getUserByID(@Param("uid") int uid);



    //插入
    @Insert("insert into users(uid,uname,uage) values (#{uid},#{uname},#{uage})")
    int addUser(User user);


    //修改
    @Update("update users set uname=#{uname},uage=#{uage} where uid = #{uid}")
    int updataUser(User user);

    //删除
    @Delete("delete from users where uid = #{uid}")
    int deleteUser(@Param("uid") int    id);
}
