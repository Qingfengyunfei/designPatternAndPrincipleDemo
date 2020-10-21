package com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 14:50
 * @since 1.0.0
 */
public interface LoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);

}
