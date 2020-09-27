package com.designPatternAndPrinciple.designPattern.creationalPatterns.singleton;

/**
 * @author Administrator
 * @description 饿汉式单例模式
 * @create 2020/9/24 15:05
 * @since 1.0.0
 */
public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
