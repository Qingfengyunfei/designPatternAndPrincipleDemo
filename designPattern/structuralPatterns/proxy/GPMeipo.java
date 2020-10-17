package com.designPatternAndPrinciple.designPattern.structuralPatterns.proxy;

import java.lang.reflect.Method;

/**
 * @author Administrator
 * @description
 * @create 2020/10/17 16:11
 * @since 1.0.0
 */
public class GPMeipo implements GPInvocationHandler{

    /**
     * 被代理的对象，把引用保存下来
     */
    private Object target;


    public Object getInstance(Object target) throws Throwable {
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.target,args);
        after();
        return null;
    }

    private void after() {
        System.out.println("如果不合适就再找");
    }

    private void before() {
        System.out.println("我是GP媒婆，我要给你找对象，已经确认了你的需求");
        System.out.println("开始物色对象");
    }

}
