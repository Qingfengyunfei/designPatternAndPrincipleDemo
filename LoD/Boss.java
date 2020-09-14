package com.designPrinciples.LoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 15:36
 * @since 1.0.0
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader) {
        //模拟Boss 一页一页往下翻页，TeamLeader实时统计
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);
    }

    public void commandCheckNumberPerf(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCoursesPerf();
    }

    public static void main(String[] args) {
        //不符合迪米特法则  因为Boss只想要结果不需要跟Course直接"交流", 而TeamLeader需要和Course进行"交流"
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);

        //此时Boss与Course没有直接关联 符合迪米特法则
        Boss bosspref = new Boss();
        TeamLeader teamLeaderpref = new TeamLeader();
        bosspref.commandCheckNumberPerf(teamLeaderpref);
    }
}
