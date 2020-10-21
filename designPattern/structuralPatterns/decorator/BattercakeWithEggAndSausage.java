package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

/**
 * @author Administrator
 * @description 煎饼加蛋加肠
 * @create 2020/10/21 15:52
 * @since 1.0.0
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg {

    @Override
    protected String getMsg() {
        return super.getMsg() + " + 1根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
