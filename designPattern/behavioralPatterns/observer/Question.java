package com.designPatternAndPrinciple.designPattern.behavioralPatterns.observer;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 17:20
 * @since 1.0.0
 */
public class Question {

    private String userName;
    private String content;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
