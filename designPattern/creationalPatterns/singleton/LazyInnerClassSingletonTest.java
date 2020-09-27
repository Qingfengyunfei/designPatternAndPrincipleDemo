package com.designPatternAndPrinciple.designPattern.creationalPatterns.singleton;

import java.lang.reflect.Constructor;

/**
 * @author Administrator
 * @description 使用静态内部类构造单例方法 容易被反射破坏 （一般不会这么做）
 * @create 2020/9/24 16:55
 * @since 1.0.0
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        LazyInnerClassSingleton l1 = LazyInnerClassSingleton.getInstance();
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;

            //通过反射获取私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问
            c.setAccessible(true);
            //初始化
            Object o1 = c.newInstance();
            System.out.println(o1 == l1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
