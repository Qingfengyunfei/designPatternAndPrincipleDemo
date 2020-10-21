package com.designPatternAndPrinciple.designPattern.behavioralPatterns.strategy;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 13:36
 * @since 1.0.0
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1", "2020158535824", 354.5);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
