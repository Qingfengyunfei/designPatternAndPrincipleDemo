package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

import com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter.Member;
import com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter.ResultMsg;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 16:37
 * @since 1.0.0
 */
public interface ISignInService {
    /**
     * 注册方法
     *
     * @param username
     * @param password
     * @return
     */
    ResultMsg register(String username, String password);

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
