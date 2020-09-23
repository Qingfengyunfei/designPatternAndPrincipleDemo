package com.designPatternAndPrinciple.designPattern.creationalPatterns.abstractfactory;

/**
 * @author Administrator
 * @description
 * @create 2020/9/23 17:25
 * @since 1.0.0
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
