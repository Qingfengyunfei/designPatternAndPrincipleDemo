package com.designPatternAndPrinciple.designPattern.structuralPatterns.proxy;

/**
 * @author Administrator
 * @description
 * @create 2020/10/14 17:58
 * @since 1.0.0
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
    }
}
