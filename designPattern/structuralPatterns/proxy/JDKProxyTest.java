package com.designPatternAndPrinciple.designPattern.structuralPatterns.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author Administrator
 * @description
 * @create 2020/10/17 14:30
 * @since 1.0.0
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new JDKMeipo().getInstance(new Customer());
            obj.findLove();
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] {Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy.0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
