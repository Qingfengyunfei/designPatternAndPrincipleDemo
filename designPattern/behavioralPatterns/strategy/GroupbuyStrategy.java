package com.designPatternAndPrinciple.designPattern.behavioralPatterns.strategy;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 10:40
 * @since 1.0.0
 */
public class GroupbuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价");
    }
}
