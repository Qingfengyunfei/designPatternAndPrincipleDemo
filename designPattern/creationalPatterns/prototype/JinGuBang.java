package com.designPatternAndPrinciple.designPattern.creationalPatterns.prototype;

import java.io.Serializable;

/**
 * @author Administrator
 * @description
 * @create 2020/10/14 10:36
 * @since 1.0.0
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big() {
        this.d *= 2;
        this.h *= 2;
    }

    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}
