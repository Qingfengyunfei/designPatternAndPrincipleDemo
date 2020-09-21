package com.designPatternAndPrinciple.designPattern.creationalPatterns.factorymethod;

import com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory.ICourse;

/**
 * @author Administrator
 * @description
 * @create 2020/9/21 17:45
 * @since 1.0.0
 */
public interface ICourseFactory {
    /**
     * 课程工厂方法创建实例
     * @return
     */
    ICourse create();
}
