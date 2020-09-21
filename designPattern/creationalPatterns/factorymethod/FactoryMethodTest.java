package com.designPatternAndPrinciple.designPattern.creationalPatterns.factorymethod;

import com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory.ICourse;

/**
 * @author Administrator
 * @description
 * @create 2020/9/21 17:48
 * @since 1.0.0
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        //1.通过Python课程工厂创建PythonCourse实例
        ICourseFactory courseFactory = new PythonCourseFactory();
        ICourse pythonCourse = courseFactory.create();
        pythonCourse.record();

        //2.通过Java课程工厂创建JavaCourse实例
        courseFactory = new JavaCourseFactory();
        ICourse javaCourse = courseFactory.create();
        javaCourse.record();
    }
}
