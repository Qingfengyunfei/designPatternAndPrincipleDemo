package com.designPatternAndPrinciple.designPattern.creationalPatterns.singleton;

/**
 * @author Administrator
 * @description 饿汉式静态块单例模式 线程安全不加锁执行效率高  但在类加载的时候就初始化 浪费空间
 * @create 2020/9/24 15:11
 * @since 1.0.0
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {}

    public static HungryStaticSingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

}
