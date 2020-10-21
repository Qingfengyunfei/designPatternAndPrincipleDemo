package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

import com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter.Member;
import com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter.ResultMsg;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 16:38
 * @since 1.0.0
 */
public class SignInService implements ISignInService {
    @Override
    public ResultMsg register(String username, String password) {
        return new ResultMsg(200,"注册成功", new Member());
    }

    @Override
    public ResultMsg login(String username, String password) {
        return null;
    }
}
