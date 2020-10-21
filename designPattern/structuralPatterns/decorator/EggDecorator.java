package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 16:06
 * @since 1.0.0
 */
public class EggDecorator extends BattercakePlusDecorator {

    public EggDecorator(BattercakePlus battercakePlus) {
        super(battercakePlus);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " + 1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
