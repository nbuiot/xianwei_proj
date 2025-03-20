package com.xianwei.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.xianwei.demo.mapper")
public class MyBatisConfig {
    // 可以在这里添加自定义的MyBatis配置
} 