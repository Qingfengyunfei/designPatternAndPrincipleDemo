package com.designPatternAndPrinciple.designPattern.creationalPatterns.singleton;

/**
 * @author Administrator
 * @description 枚举式单例模式
 *              实质：在静态代码块中对INSTANCE进行赋值，属于饿汉式单例模式
 * @create 2020/10/13 11:49
 * @since 1.0.0
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
