package com.designPrinciples.ISP;

/**
 * @author Administrator
 * @description 接口隔离原则 鸟类实现多个单一接口 而不是臃肿的IAnimal接口
 * @create 2020/9/14 15:23
 * @since 1.0.0
 */
public class Bird implements IEatAnimal, IFlyAnimal {
    @Override
    public void eat() {
        System.out.println("Bird can eat");
    }

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}
