package com.designPrinciples.ISP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 15:09
 * @since 1.0.0
 */
public class DogDemo implements IAnimal {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        //DogDemo类的该方法多余
    }

    @Override
    public void swim() {

    }
}
