package com.designPrinciples.SRP;

/**
 * @author Administrator
 * @description 分离出课程管理接口
 * @create 2020/9/14 14:15
 * @since 1.0.0
 */
public interface ICourseManager {
    /**
     * 学习课程
     */
    void studyCourse();

    /**
     * 退款
     */
    void refundCourse();
}
