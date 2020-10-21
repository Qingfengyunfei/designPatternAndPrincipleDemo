package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

/**
 * @author Administrator
 * @description  加强版煎饼抽象类
 * @create 2020/10/21 15:48
 * @since 1.0.0
 */
public abstract class BattercakePlus {
    /**
     * 获取煎饼信息
     * @return
     */
    protected abstract String getMsg();

    /**
     * 获取煎饼价钱
     * @return
     */
    protected abstract int getPrice();
}
