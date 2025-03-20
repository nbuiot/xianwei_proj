package com.xianwei.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.xianwei.demo.entity.User;

/**
 * 用户Mapper接口
 */
@Mapper
public interface UserMapper {
    
    /**
     * 根据用户名查询用户信息
     * 
     * @param username 用户名
     * @return 用户信息
     */
    @Select("SELECT id, username, password, role FROM users WHERE username = #{username}")
    User findByUsername(@Param("username") String username);
} 