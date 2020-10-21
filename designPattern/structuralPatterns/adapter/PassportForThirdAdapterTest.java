package com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 15:08
 * @since 1.0.0
 */
public class PassportForThirdAdapterTest {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("123");
    }
}
