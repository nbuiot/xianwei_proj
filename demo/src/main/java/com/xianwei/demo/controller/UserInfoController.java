package com.xianwei.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.xianwei.demo.common.Result;
import com.xianwei.demo.entity.UserInfo;
import com.xianwei.demo.service.UserInfoService;

/**
 * 用户信息控制器
 */
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    
    /**
     * 根据用户ID查询用户信息
     * 
     * @param userID 用户ID
     * @return 用户信息
     */
    @GetMapping("/userinfo/{UserID}")
    public Result<UserInfo> getUserInfo(@PathVariable("UserID") Integer userID) {
        return userInfoService.getUserInfoByID(userID);
    }
} 