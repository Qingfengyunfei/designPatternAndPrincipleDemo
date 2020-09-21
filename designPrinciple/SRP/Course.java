package com.designPrinciples.SRP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 12:02
 * @since 1.0.0
 */
public class Course {
    public void study(String courseName) {
        if ("直播课".equals(courseName)) {
            System.out.println(courseName + "不能快进");
        } else {
            System.out.println(courseName + "可以反复回看");
        }
    }

    public static void main(String[] args) {
        Course course = new Course();
        course.study("直播课");
        course.study("录播课");
    }

}

