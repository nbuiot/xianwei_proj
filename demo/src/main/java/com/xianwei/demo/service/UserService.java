package com.xianwei.demo.service;

import com.xianwei.demo.common.Result;
import com.xianwei.demo.dto.LoginRequest;
import com.xianwei.demo.dto.UserInfoDTO;

/**
 * 用户服务接口
 */
public interface UserService {
    
    /**
     * 用户登录
     * 
     * @param loginRequest 登录请求参数
     * @return 登录结果
     */
    Result<UserInfoDTO> login(LoginRequest loginRequest);
} 