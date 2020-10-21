package com.designPatternAndPrinciple.designPattern.behavioralPatterns.template;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 14:01
 * @since 1.0.0
 */
public class BigDataCourse extends NetworkCourse {

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据课后作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
