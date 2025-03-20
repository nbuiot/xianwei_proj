package com.xianwei.demo.service;

import com.xianwei.demo.common.Result;
import com.xianwei.demo.entity.UserInfo;

/**
 * 用户信息服务接口
 */
public interface UserInfoService {
    
    /**
     * 根据用户ID查询用户信息
     * 
     * @param userID 用户ID
     * @return 查询结果
     */
    Result<UserInfo> getUserInfoByID(Integer userID);
} 