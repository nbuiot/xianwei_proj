package com.xianwei.auth.service;

import com.xianwei.auth.dto.LoginRequest;
import com.xianwei.auth.dto.RegisterRequest;

public interface UserService {
    void register(RegisterRequest request);
    String login(LoginRequest request);
}
