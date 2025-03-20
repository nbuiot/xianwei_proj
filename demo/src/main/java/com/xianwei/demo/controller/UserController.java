package com.xianwei.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xianwei.demo.common.Result;
import com.xianwei.demo.dto.LoginRequest;
import com.xianwei.demo.dto.UserInfoDTO;
import com.xianwei.demo.service.UserService;

/**
 * 用户控制器
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    /**
     * 用户登录
     * 
     * @param loginRequest 登录请求参数
     * @return 登录结果
     */
    @PostMapping("/login")
    public Result<UserInfoDTO> login(@RequestBody LoginRequest loginRequest) {
        return userService.login(loginRequest);
    }
} 