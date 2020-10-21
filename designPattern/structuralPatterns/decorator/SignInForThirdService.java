package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

import com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter.ResultMsg;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 16:43
 * @since 1.0.0
 */
public class SignInForThirdService implements ISignInForThirdService {

    private ISignInService signIn;

    public SignInForThirdService(ISignInService signIn) {
        this.signIn = signIn;
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegister(String username, String passport) {
        return null;
    }

    @Override
    public ResultMsg register(String username, String password) {
        return signIn.register(username, password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return signIn.login(username, password);
    }
}
