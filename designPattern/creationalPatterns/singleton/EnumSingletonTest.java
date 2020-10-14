package com.designPatternAndPrinciple.designPattern.creationalPatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author Administrator
 * @description
 * @create 2020/10/13 12:01
 * @since 1.0.0
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        try {
            //枚举类型通过类名和类对象类找到一个唯一的枚举对象所以不会被加载多次
            EnumSingleton instance1 = null;
            EnumSingleton instance2 = EnumSingleton.getInstance();
            instance2.setData(new Object());

            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(instance1.getData());
            System.out.println(instance2.getData());
            System.out.println(instance1.getData() == instance2.getData());

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Class clazz1 = EnumSingleton.class;
            //枚举类型没有无参构造方法 会抛出异常NoSuchMethodException
            Constructor c = clazz1.getDeclaredConstructor();
            c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            Class clazz2 = EnumSingleton.class;
            Constructor c = clazz2.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            //枚举类型 newInstance()方法中判断如果是Modifier.ENUM 直接抛出异常IllegalArgumentException，防止反射破坏单例
            EnumSingleton enumSingleton = (EnumSingleton) c.newInstance("Tom",666);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
