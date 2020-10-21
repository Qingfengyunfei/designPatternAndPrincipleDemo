package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 16:01
 * @since 1.0.0
 */
public class BaseBattercakePlus extends BattercakePlus {

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
