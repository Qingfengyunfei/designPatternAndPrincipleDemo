package com.designPatternAndPrinciple.designPattern.creationalPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @description 浅克隆测试
 * @create 2020/10/14 10:25
 * @since 1.0.0
 */
public class PrototypeATest {
    public static void main(String[] args) {
        PrototypeA p1 = new PrototypeA();
        p1.setAge(18);
        p1.setName("prototype");
        List hobbies = new ArrayList<String>();
        hobbies.add("浅");
        hobbies.add("克");
        hobbies.add("隆");
        p1.setHobbies(hobbies);
        System.out.println(p1);

        PrototypeA p2 = p1.clone();
        System.out.println(p2);
        System.out.println(p1.getHobbies());
        System.out.println(p2.getHobbies());
        System.out.println(p1.getHobbies() == p2.getHobbies());

//        com.designPatternAndPrinciple.designPattern.creationalPatterns.prototype.PrototypeA@14ae5a5      不同对象
//        com.designPatternAndPrinciple.designPattern.creationalPatterns.prototype.PrototypeA@7f31245a
//        [浅, 克, 隆]         引用地址相同修改任意一个 另一个都会变
//        [浅, 克, 隆]
//        true

    }
}
