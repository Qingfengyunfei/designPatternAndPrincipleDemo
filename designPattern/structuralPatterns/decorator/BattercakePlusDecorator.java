package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 16:03
 * @since 1.0.0
 */
public abstract class BattercakePlusDecorator extends BattercakePlus {

    /**
     * 静态代理，委派
     */
    private BattercakePlus battercakePlus;

    public BattercakePlusDecorator(BattercakePlus battercakePlus) {
        this.battercakePlus = battercakePlus;
    }

    /**
     * 煎饼加工方法
     */
    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercakePlus.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercakePlus.getPrice();
    }
}
