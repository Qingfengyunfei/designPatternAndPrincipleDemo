package com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter;

/**
 * @author Administrator
 * @description 第三方登录兼容接口
 * @create 2020/10/21 14:55
 * @since 1.0.0
 */
public interface IPassportForThird {

    /**
     * QQ登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);

    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);

    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegister(String username, String passport);
}
