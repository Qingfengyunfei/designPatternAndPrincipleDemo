package com.designPatternAndPrinciple.designPattern.creationalPatterns.prototype;

/**
 * @author Administrator
 * @description 原型模式接口
 * @create 2020/10/14 10:21
 * @since 1.0.0
 */
public interface Prototype {
    /**
     * 克隆方法
     * @return
     */
    Prototype clone();
}
