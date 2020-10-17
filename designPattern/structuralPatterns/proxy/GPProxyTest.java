package com.designPatternAndPrinciple.designPattern.structuralPatterns.proxy;

/**
 * @author Administrator
 * @description 自定义JDK动态代理测试
 * @create 2020/10/17 16:21
 * @since 1.0.0
 */
public class GPProxyTest {

    public static void main(String[] args) {
        try {
            Person obj = (Person) new GPMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findLove();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
