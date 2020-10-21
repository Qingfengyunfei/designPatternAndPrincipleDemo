package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 16:46
 * @since 1.0.0
 */
public class SignInForThirdTest {
    public static void main(String[] args) {
        ISignInForThirdService signInForThirdService = new SignInForThirdService(new SignInService());
        signInForThirdService.loginForQQ("asjdaklwjd");
        signInForThirdService.login("asjdaklwjd","123");
        //动态增加或者覆盖原有方法时，采用装饰者模式
    }
}
