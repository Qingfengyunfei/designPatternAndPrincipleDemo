package com.designPrinciples.OCP;

/**
 * @author Administrator
 * @description 开闭原则  对扩展开放对修改关闭 不改变原来代码的情况下，对新的代码扩展
 * @create 2020/9/14 10:45
 * @since 1.0.0
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    public Double getPrice(){
        return super.getPrice() * 0.61;
    }
}
