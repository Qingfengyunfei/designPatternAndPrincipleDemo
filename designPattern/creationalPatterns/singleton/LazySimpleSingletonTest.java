package com.designPatternAndPrinciple.designPattern.creationalPatterns.singleton;

/**
 * @author Administrator
 * @description
 * @create 2020/9/24 15:41
 * @since 1.0.0
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
//        Thread t3 = new Thread(new ExectorThread2());
//        Thread t4 = new Thread(new ExectorThread2());
//        t3.start();
//        t4.start();
//        System.out.println("End");
    }
}
