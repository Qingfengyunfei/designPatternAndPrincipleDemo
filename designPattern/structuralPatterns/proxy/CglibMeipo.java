package com.designPatternAndPrinciple.designPattern.structuralPatterns.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Administrator
 * @description
 * @create 2020/10/17 16:40
 * @since 1.0.0
 */
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        // 要把哪个设置为即将生成的新类的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 业务增强
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return obj;
    }

    private void after() {
        System.out.println("如果觉得一般就谈谈");
    }

    private void before() {
        System.out.println("我是Cglib媒婆，我要给你找对象，已经确认了你的需求");
        System.out.println("开始物色对象");
    }
}
