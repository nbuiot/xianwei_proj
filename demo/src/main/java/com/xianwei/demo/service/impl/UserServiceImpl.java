package com.xianwei.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xianwei.demo.common.Result;
import com.xianwei.demo.dto.LoginRequest;
import com.xianwei.demo.dto.UserInfoDTO;
import com.xianwei.demo.entity.User;
import com.xianwei.demo.mapper.UserMapper;
import com.xianwei.demo.service.UserService;

/**
 * 用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    
    /**
     * 用户登录
     */
    @Override
    public Result<UserInfoDTO> login(LoginRequest loginRequest) {
        // 根据用户名查询用户
        User user = userMapper.findByUsername(loginRequest.getUsername());
        
        // 判断用户是否存在
        if (user == null) {
            return Result.error("用户名不存在");
        }
        
        // 判断密码是否正确
        if (!user.getPassword().equals(loginRequest.getPassword())) {
            return Result.error("密码错误");
        }
        
        // 登录成功，返回用户角色信息
        UserInfoDTO userInfoDTO = new UserInfoDTO(user.getRole());
        return Result.success(userInfoDTO);
    }
} 