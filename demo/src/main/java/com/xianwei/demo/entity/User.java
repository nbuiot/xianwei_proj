package com.xianwei.demo.entity;

/**
 * 用户实体类
 */
public class User {
    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
    
    /**
     * 用户角色：admin或user
     */
    private String role;

    /**
     * 获取用户ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     */
    public void setPassword(String password) {
        this.password = password;
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