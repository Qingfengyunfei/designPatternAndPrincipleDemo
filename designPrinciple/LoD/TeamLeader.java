package com.designPrinciples.LoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 15:34
 * @since 1.0.0
 */
public class TeamLeader {
    public void checkNumberOfCourses(List<Course> courseList) {
        System.out.println("目前已发布的课程数量是：" + courseList.size());
    }

    public void checkNumberOfCoursesPerf() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("目前已发布的课程数量是：" + courseList.size());
    }

}
