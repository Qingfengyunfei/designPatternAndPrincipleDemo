package com.designPatternAndPrinciple.designPattern.creationalPatterns.abstractfactory;

/**
 * @author Administrator
 * @description
 * @create 2020/9/23 17:25
 * @since 1.0.0
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Python笔记");
    }
}
