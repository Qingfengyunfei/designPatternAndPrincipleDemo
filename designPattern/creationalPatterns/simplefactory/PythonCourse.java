package com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory;

/**
 * @author Administrator
 * @description Python课程类
 * @create 2020/9/21 17:01
 * @since 1.0.0
 */
public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
