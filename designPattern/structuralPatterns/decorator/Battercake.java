package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

/**
 * @author Administrator
 * @description 煎饼类
 * @create 2020/10/21 15:48
 * @since 1.0.0
 */
public class Battercake {

    protected String getMsg() {
        return "煎饼";
    }

    public int getPrice() {
        return 5;
    }
}
