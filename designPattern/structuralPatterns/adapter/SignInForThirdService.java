package com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 14:42
 * @since 1.0.0
 */
public class SignInForThirdService extends SignInService {

    public ResultMsg loginForQQ(String openId) {
        // 省略部分QQ登录方法
        return loginForRegister(openId, null);
    }

    private ResultMsg loginForRegister(String username, String password) {
        super.register(username, null);
        return super.login(username, null);
    }

    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        // 通过Token 获取用户信息，然后重新登录
        return null;
    }


}
