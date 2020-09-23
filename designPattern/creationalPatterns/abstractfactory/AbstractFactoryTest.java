package com.designPatternAndPrinciple.designPattern.creationalPatterns.abstractfactory;

/**
 * @author Administrator
 * @description
 * @create 2020/9/23 17:29
 * @since 1.0.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNote().edit();
        javaCourseFactory.createVideo().record();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createNote().edit();
        pythonCourseFactory.createVideo().record();
    }
}
