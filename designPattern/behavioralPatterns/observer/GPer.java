package com.designPatternAndPrinciple.designPattern.behavioralPatterns.observer;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Observable;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 17:11
 * @since 1.0.0
 */
public class GPer extends Observable {

    private String name = "GPer 生态圈";

    private static GPer gper = null;

    private GPer() {
    }

    public static GPer getInstance() {
        if (null == gper) {
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
