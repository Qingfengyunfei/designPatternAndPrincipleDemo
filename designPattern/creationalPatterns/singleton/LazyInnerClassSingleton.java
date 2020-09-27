package com.designPatternAndPrinciple.designPattern.creationalPatterns.singleton;

/**
 * @author Administrator
 * @description 静态内部类加载单例  优点：避免饿汉式单例 内存浪费 又避免使用sychronized造成性能问题
 * @create 2020/9/24 16:33
 * @since 1.0.0
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    /**
     * static 保证使单例的空间共享 final保证这个方法不会被重写重载p[
     *
     * @return
     */
    public static final LazyInnerClassSingleton getInstance() {
        //返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    /**
     * 默认不加载
     */
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
