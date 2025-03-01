package com.xianwei.auth.service.impl;

import com.xianwei.auth.dto.LoginRequest;
import com.xianwei.auth.dto.RegisterRequest;
import com.xianwei.auth.config.entity.User;
import com.xianwei.auth.repository.UserRepository;
import com.xianwei.auth.service.UserService;
import com.xianwei.auth.utils.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void register(RegisterRequest request) {
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("用户名已存在");
        }

        User user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .discountRate(BigDecimal.ZERO)
                .createdAt(LocalDateTime.now())
                .build();
        userRepository.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public String login(LoginRequest request) {
        User user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new UsernameNotFoundException("用户不存在"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("密码错误");
        }

        return JwtUtils.generateToken(user.getUsername());
    }
}
