package com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 14:47
 * @since 1.0.0
 */
public class SignInForThirdServiceTest {
    public static void main(String[] args) {
        SignInForThirdService signInForThirdService = new SignInForThirdService();
        // 不改变原来的代码，兼容新需求，还可以增加策略模式
        signInForThirdService.loginForQQ("nfsdjfioejf");
    }
}
