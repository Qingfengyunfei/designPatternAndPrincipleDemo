package com.designPatternAndPrinciple.designPattern.extraPatterns.delegate;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 10:06
 * @since 1.0.0
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我现在开始做" + command + "工作");
    }
}
