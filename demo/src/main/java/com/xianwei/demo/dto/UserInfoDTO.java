package com.xianwei.demo.dto;

/**
 * 用户信息DTO
 */
public class UserInfoDTO {
    /**
     * 用户角色
     */
    private String role;
    
    /**
     * 无参构造函数
     */
    public UserInfoDTO() {
    }
    
    /**
     * 有参构造函数
     */
    public UserInfoDTO(String role) {
        this.role = role;
    }
    
    /**
     * 获取用户角色
     */
    public String getRole() {
        return role;
    }
    
    /**
     * 设置用户角色
     */
    public void setRole(String role) {
        this.role = role;
    }
} 