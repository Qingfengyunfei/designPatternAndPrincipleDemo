package com.designPatternAndPrinciple.designPattern.creationalPatterns.factorymethod;

import com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory.ICourse;
import com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory.PythonCourse;

/**
 * @author Administrator
 * @description Python课程工厂
 * @create 2020/9/21 17:47
 * @since 1.0.0
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
