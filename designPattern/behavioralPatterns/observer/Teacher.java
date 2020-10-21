package com.designPatternAndPrinciple.designPattern.behavioralPatterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Administrator
 * @description 观察者
 * @create 2020/10/21 17:22
 * @since 1.0.0
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gper = (GPer) o;
        Question question = (Question) arg;
        System.out.println("===========");
        System.out.println(name + "hello teacher! \n" + "您收到了一个来自“"
                + gper.getName() + "”的提问，内容如下：\n" + question.getContent() + "\n"
                + "提问者：" + question.getUserName());
    }
}
