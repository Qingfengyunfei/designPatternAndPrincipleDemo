package com.designPrinciples.OCP;

/**
 * @author Administrator
 * @description 课程接口
 * @create 2020/9/14 10:40
 * @since 1.0.0
 */
public interface ICourse {
    /**
     * get CourseID
     * @return courseID
     */
    Integer getId();

    /**
     * get CourseName
     * @return courseName
     */
    String getName();

    /**
     * get CoursePrice
     * @return coursePrice
     */
    Double getPrice();
}
