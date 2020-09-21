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

    /**
     * 获取原价格 (直接使用父类方法即可)
     *
     * @return
     */
//    public Double getOriginPrice() {
//        return super.getPrice();
//    }

    /**
     * 减价方法
     * ps：此处违背了里氏替换原则 不应该修改原来的 getPrice方法而应该增加一个 getDiscountPrice方法
     *
     * @return
     */
//    @Override
//    public Double getPrice(){
//        return super.getPrice() * 0.61;
//    }

    /**
     * 打折方法
     *
     * @return
     */
    public Double getDiscountPrice() {
        return super.getPrice() * 0.61;
    }

}
