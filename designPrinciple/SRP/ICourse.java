package com.designPrinciples.SRP;

/**
 * @author Administrator
 * @description 单一职责原则 设计顶层ICourse接口 有四个方法
 * @create 2020/9/14 14:10
 * @since 1.0.0
 */
public interface ICourse {
    /**
     * 获取课程基本信息
     *
     * @return 课程基本信息（Name）
     */
    String getCourseName();

    /**
     * 获取课程视频流
     *
     * @return
     */
    byte[] getCourseVideo();

    /**
     * 学习课程
     */
    void studyCourse();

    /**
     * 退款
     */
    void refundCourse();

}
