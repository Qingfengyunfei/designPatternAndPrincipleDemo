package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 16:09
 * @since 1.0.0
 */
public class SausageDecorator extends BattercakePlusDecorator {
    public SausageDecorator(BattercakePlus battercakePlus) {
        super(battercakePlus);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " + 1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
