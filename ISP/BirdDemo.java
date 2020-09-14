package com.designPrinciples.ISP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 14:39
 * @since 1.0.0
 */
public class BirdDemo implements IAnimal {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        //BirdDemo类的该方法多余
    }
}
