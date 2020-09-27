package com.designPatternAndPrinciple.designPattern.creationalPatterns.singleton;

/**
 * @author Administrator
 * @description
 * @create 2020/9/24 15:38
 * @since 1.0.0
 */
public class ExectorThread3 implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazyDoubleCheckSingleton);
    }
}
