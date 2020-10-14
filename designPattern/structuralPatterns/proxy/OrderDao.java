package com.designPatternAndPrinciple.designPattern.structuralPatterns.proxy;

/**
 * @author Administrator
 * @description
 * @create 2020/10/14 14:59
 * @since 1.0.0
 */
public class OrderDao {
    public int insert(Order order) {
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
