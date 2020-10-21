package com.designPatternAndPrinciple.designPattern.extraPatterns.delegate;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 10:14
 * @since 1.0.0
 */
public class DelegateTest {
    public static void main(String[] args) {
        // 代理模式注重过程，委派模式注重结果
        // 策略模式注重可扩展性，委派模式注重内部灵活性和可复用性
        // 委派模式的核心就是分发、调度、派遣，委派模式是静态代理和策略模式的一种特殊组合
        new Boss().command("登录", new Leader());
    }
}
