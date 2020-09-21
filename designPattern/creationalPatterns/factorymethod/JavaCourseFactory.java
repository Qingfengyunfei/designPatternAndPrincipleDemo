package com.designPatternAndPrinciple.designPattern.creationalPatterns.factorymethod;

import com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory.ICourse;
import com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory.JavaCourse;

/**
 * @author Administrator
 * @description Java课程工厂
 * @create 2020/9/21 17:46
 * @since 1.0.0
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
