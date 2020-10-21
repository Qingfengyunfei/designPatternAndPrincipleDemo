package com.designPatternAndPrinciple.designPattern.extraPatterns.delegate;

/**
 * @author Administrator
 * @description 员工抽象类
 * @create 2020/10/21 10:05
 * @since 1.0.0
 */
public interface IEmployee {
    /**
     * 员工做事
     * @param command
     */
    void doing(String command);
}
