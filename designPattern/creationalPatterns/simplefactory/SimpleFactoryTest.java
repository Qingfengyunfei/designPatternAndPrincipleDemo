package com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory;

/**
 * @author Administrator
 * @description 简单工厂方法 测试类
 * @create 2020/9/21 17:09
 * @since 1.0.0
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //1.工厂非静态方法创建
        CourseFactoryV1 courseFactoryV1 = new CourseFactoryV1();
        ICourse javaCourse = courseFactoryV1.create("java");
        javaCourse.record();

        //2.工厂静态方法创建
        ICourse pythonCourse = CourseFactoryV1.createStatic("python");
        pythonCourse.record();

        //3.工厂静态反射方法创建（通过类名称）
        ICourse javaCourse2 = CourseFactoryV2
                .createStaticByClassName("com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory.JavaCourse");
        javaCourse2.record();

        //4.工厂静态反射方法创建（通过具体类）
        ICourse pythonCourse2 = CourseFactoryV2
                .createStaticByClass(PythonCourse.class);
        pythonCourse2.record();
    }
}
