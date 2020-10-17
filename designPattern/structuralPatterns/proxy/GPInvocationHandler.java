package com.designPatternAndPrinciple.designPattern.structuralPatterns.proxy;

import java.lang.reflect.Method;

/**
 * @author Administrator
 * @description
 * @create 2020/10/17 14:39
 * @since 1.0.0
 */
public interface GPInvocationHandler {
    /**
     * 自定义类加载创建方法
     * @param proxy 代理类
     * @param method 方法
     * @param args 参数
     * @return
     * @throws Throwable
     */
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
