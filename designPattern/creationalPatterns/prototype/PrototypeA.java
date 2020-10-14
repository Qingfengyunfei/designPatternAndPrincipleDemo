package com.designPatternAndPrinciple.designPattern.creationalPatterns.prototype;

import java.util.List;

/**
 * @author Administrator
 * @description 浅克隆
 * @create 2020/10/14 10:22
 * @since 1.0.0
 */
public class PrototypeA implements Prototype {
    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public PrototypeA clone() {
        PrototypeA prototypeA = new PrototypeA();
        prototypeA.setAge(this.age);
        prototypeA.setName(this.name);
        prototypeA.setHobbies(this.hobbies);
        return prototypeA;
    }
}
