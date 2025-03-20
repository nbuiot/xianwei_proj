package com.xianwei.demo.common;

/**
 * 统一响应结果类
 */
public class Result<T> {
    /**
     * 响应码: 1成功, 0失败
     */
    private Integer code;
    
    /**
     * 提示信息
     */
    private String msg;
    
    /**
     * 响应数据
     */
    private T data;
    
    /**
     * 获取响应码
     */
    public Integer getCode() {
        return code;
    }
    
    /**
     * 设置响应码
     */
    public void setCode(Integer code) {
        this.code = code;
    }
    
    /**
     * 获取提示信息
     */
    public String getMsg() {
        return msg;
    }
    
    /**
     * 设置提示信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    /**
     * 获取响应数据
     */
    public T getData() {
        return data;
    }
    
    /**
     * 设置响应数据
     */
    public void setData(T data) {
        this.data = data;
    }
    
    /**
     * 成功响应
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(1);
        result.setMsg("success");
        result.setData(data);
        return result;
    }
    
    /**
     * 失败响应
     */
    public static <T> Result<T> error(String msg) {
        Result<T> result = new Result<>();
        result.setCode(0);
        result.setMsg(msg);
        return result;
    }
} 