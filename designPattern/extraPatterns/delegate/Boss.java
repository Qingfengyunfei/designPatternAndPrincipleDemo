package com.designPatternAndPrinciple.designPattern.extraPatterns.delegate;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 10:12
 * @since 1.0.0
 */
public class Boss {
    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
