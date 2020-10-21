package com.designPatternAndPrinciple.designPattern.behavioralPatterns.observer;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 17:28
 * @since 1.0.0
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher sam = new Teacher("sam");
        Teacher mik = new Teacher("mik");

        // 增加观察者
        gper.addObserver(sam);
        gper.addObserver(mik);

        // 业务逻辑代码
        Question q = new Question();
        q.setUserName("小王");
        q.setContent("spring如何学习");

        gper.publishQuestion(q);
    }
}
