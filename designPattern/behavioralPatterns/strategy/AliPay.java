package com.designPatternAndPrinciple.designPattern.behavioralPatterns.strategy;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 11:10
 * @since 1.0.0
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
