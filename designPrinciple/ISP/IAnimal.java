package com.designPrinciples.ISP;

/**
 * @author Administrator
 * @description 设计动物总接口  包含吃 飞 游泳 等动作 不符合接口隔离原则
 * @create 2020/9/14 14:37
 * @since 1.0.0
 */
public interface IAnimal {
    /**
     * eat action
     */
    void eat();

    /**
     * fly action
     */
    void fly();

    /**
     * swim action
     */
    void swim();
}
