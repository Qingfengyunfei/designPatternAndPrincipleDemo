package com.designPatternAndPrinciple.designPattern.structuralPatterns.proxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author Administrator
 * @description
 * @create 2020/10/17 16:59
 * @since 1.0.0
 */
public class CglibTest {
    public static void main(String[] args) {
        try {
            // 利用CGlib的代理类可以将内存中的.class文件写入本地磁盘
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://cglib_proxy_class/");

            CustomerB obj = (CustomerB) new CglibMeipo().getInstance(CustomerB.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
