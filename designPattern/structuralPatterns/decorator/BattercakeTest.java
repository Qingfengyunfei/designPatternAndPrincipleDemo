package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

/**
 * @author Administrator
 * @description  只是继承的父类并改写子类的方法 并不能满足用户多种需求 如加两个蛋 两根肠 需要额外加方法，拓展性不好
 * @create 2020/10/21 15:53
 * @since 1.0.0
 */
public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + ",总价格：" +battercake.getPrice());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg()+",总价格：" +battercakeWithEgg.getPrice());

        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg()+",总价格：" +battercakeWithEggAndSausage.getPrice());
    }
}
