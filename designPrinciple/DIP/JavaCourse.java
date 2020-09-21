package com.designPrinciples.DIP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 11:15
 * @since 1.0.0
 */
public class JavaCourse implements ICourse {

    @Override
    public void study() {
        System.out.println("Tom is learning JavaCourse");
    }

}
