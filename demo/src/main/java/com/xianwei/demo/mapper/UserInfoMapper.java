package com.xianwei.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.xianwei.demo.entity.UserInfo;

/**
 * 用户信息Mapper接口
 */
@Mapper
public interface UserInfoMapper {
    
    /**
     * 根据用户ID查询用户信息
     * 
     * @param userID 用户ID
     * @return 用户信息
     */
    @ResultMap("BaseResultMap")
    @Select("SELECT * FROM UserInfo WHERE UserID = #{userID}")
    UserInfo findByUserID(@Param("userID") Integer userID);
} 