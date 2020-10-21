package com.designPatternAndPrinciple.designPattern.structuralPatterns.decorator;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 16:19
 * @since 1.0.0
 */
public class BattercakePlusTest {
    public static void main(String[] args) {
        BattercakePlus battercakePlus;
        //买一个煎饼
        battercakePlus = new BaseBattercakePlus();
        //加一个蛋
        battercakePlus = new EggDecorator(battercakePlus);
        //再加一个蛋
        battercakePlus = new EggDecorator(battercakePlus);
        //加一根肠
        battercakePlus = new SausageDecorator(battercakePlus);

        // 跟静态代理最大的区别就是指责不同
        // 静态代理不一定满足 is—a 的关系
        // 静态代理会做功能增强，使同一个值得变得不一样

        //装饰者模式更多考虑拓展
        System.out.println(battercakePlus.getMsg()+",总价格：" +battercakePlus.getPrice());
    }
}
