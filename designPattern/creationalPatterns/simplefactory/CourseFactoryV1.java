package com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory;

/**
 * @author Administrator
 * @description v1.0 通过简单工厂创建  缺点：业务扩展 需要更改create里面的代码 违反了开闭原则
 * @create 2020/9/21 17:03
 * @since 1.0.0
 */
public class CourseFactoryV1 {

    public ICourse create(String courseName) {
        if ("java".equals(courseName)) {
            return new JavaCourse();
        } else if ("python".equals(courseName)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }

    public static ICourse createStatic(String courseName) {
        if ("java".equals(courseName)) {
            return new JavaCourse();
        } else if ("python".equals(courseName)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }
}
