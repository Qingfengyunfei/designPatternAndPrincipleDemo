package com.designPrinciples.SRP;

/**
 * @author Administrator
 * @description 分离出课程信息接口
 * @create 2020/9/14 14:14
 * @since 1.0.0
 */
public interface ICourseInfo {
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
}
