package com.designPrinciples.SRP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 13:36
 * @since 1.0.0
 */
public class LiveCourse {
    public void study(String courseName){
        System.out.println(courseName + "不能快进看");
    }

    public static void main(String[] args) {
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");
    }
}
