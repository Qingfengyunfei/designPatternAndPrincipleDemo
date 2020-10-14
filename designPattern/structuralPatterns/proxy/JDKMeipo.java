package com.designPatternAndPrinciple.designPattern.structuralPatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Administrator
 * @description 婚姻介绍所 媒婆类
 * @create 2020/10/14 16:35
 * @since 1.0.0
 */
public class JDKMeipo implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("如果合适就结婚");
    }

    private void before() {
        System.out.println("我是媒婆，我要给你找对象，已经确认了你的需求");
        System.out.println("开始物色对象");
    }

}
