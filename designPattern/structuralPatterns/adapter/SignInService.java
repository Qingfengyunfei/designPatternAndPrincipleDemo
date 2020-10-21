package com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter;

/**
 * @author Administrator
 * @description 老代码登录系统
 * @create 2020/10/21 14:35
 * @since 1.0.0
 */
public class SignInService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username, String password) {
        return new ResultMsg(200,"注册成功", new Member());
    }

    public ResultMsg login(String username, String password) {
        return null;
    }
}
