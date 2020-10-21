package com.designPatternAndPrinciple.designPattern.behavioralPatterns.strategy;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 10:45
 * @since 1.0.0
 */
public class PromotionTest {
    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());

        activity618.execute();
        activity1111.execute();
    }

}
