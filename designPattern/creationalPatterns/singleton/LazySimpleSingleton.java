package com.designPatternAndPrinciple.designPattern.creationalPatterns.singleton;

/**
 * @author Administrator
 * @description 懒汉示单例模式   优点：延迟加载  缺点：普通写法非线程安全
 * 因为判断 lazySimpleSingleton == null 时没有线程安全确保机制
 * 线程安全写法 虽然可以保证线程安全 但加sychronized关键字 加锁 对性能有影响
 * @create 2020/9/24 15:23
 * @since 1.0.0
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton() {}

    /**
     * 非线程安全 不加锁
     * @return
     */
    public static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

    /**
     * 线程安全  加锁
     * @return
     */
    public synchronized static LazySimpleSingleton safeGetInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
