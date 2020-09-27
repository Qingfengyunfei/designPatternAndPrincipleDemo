package com.designPatternAndPrinciple.designPattern.creationalPatterns.singleton;

/**
 * @author Administrator
 * @description 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @create 2020/9/24 16:14
 * @since 1.0.0
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if(lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
