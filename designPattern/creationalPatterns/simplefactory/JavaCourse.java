package com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory;

/**
 * @author Administrator
 * @description Java课程类
 * @create 2020/9/21 16:56
 * @since 1.0.0
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Java课程");
    }
}
