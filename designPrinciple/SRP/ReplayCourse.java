package com.designPrinciples.SRP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 13:36
 * @since 1.0.0
 */
public class ReplayCourse {
    public void study(String courseName){
        System.out.println(courseName + "可以反复回看");
    }

    public static void main(String[] args) {
        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");
    }
}
