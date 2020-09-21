package com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory;

/**
 * @author Administrator
 * @description
 * @create 2020/9/21 16:59
 * @since 1.0.0
 */
public class JavaCourseTest {
    public static void main(String[] args) {
        //调用方式  直接通过new ICourse 接口的实现类JavaCourse来获取JavaCourse对象 如果后期业务扩展 代码会臃肿
        ICourse course = new JavaCourse();
        course.record();
    }
}
