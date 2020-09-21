package com.designPrinciples.ISP;

/**
 * @author Administrator
 * @description 接口隔离原则 狗类实现多个单一接口 而不是臃肿的IAnimal接口
 * @create 2020/9/14 15:25
 * @since 1.0.0
 */
public class Dog implements IEatAnimal, ISwimAnimal {
    @Override
    public void eat() {
        System.out.println("Dog can eat");
    }

    @Override
    public void swim() {
        System.out.println("Dog can swim");
    }
}
