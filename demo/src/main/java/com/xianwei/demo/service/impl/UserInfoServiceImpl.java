package com.xianwei.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xianwei.demo.common.Result;
import com.xianwei.demo.entity.UserInfo;
import com.xianwei.demo.mapper.UserInfoMapper;
import com.xianwei.demo.service.UserInfoService;

/**
 * 用户信息服务实现类
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    
    @Override
    public Result<UserInfo> getUserInfoByID(Integer userID) {
        // 根据用户ID查询用户信息
        UserInfo userInfo = userInfoMapper.findByUserID(userID);
        
        // 判断用户信息是否存在
        if (userInfo == null) {
            return Result.error("用户信息不存在");
        }
        
        // 返回用户信息
        return Result.success(userInfo);
    }
} 