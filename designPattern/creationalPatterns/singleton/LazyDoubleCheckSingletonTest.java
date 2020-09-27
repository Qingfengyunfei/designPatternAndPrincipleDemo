package com.designPatternAndPrinciple.designPattern.creationalPatterns.singleton;

/**
 * @author Administrator
 * @description
 * @create 2020/9/24 16:26
 * @since 1.0.0
 */
public class LazyDoubleCheckSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread3());
        Thread t2 = new Thread(new ExectorThread3());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
