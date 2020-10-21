package com.designPatternAndPrinciple.designPattern.behavioralPatterns.template;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 14:00
 * @since 1.0.0
 */
public class JavaCourse extends NetworkCourse {
    @Override
    void checkHomework() {
        System.out.println("检查Java的架构课件");
    }
}
