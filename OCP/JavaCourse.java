package com.designPrinciples.OCP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 10:41
 * @since 1.0.0
 */
public class JavaCourse implements ICourse{
    /**
     * 课程id
     */
    private Integer Id;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 课程价格
     */
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public Double getPrice() {
        return this.getPrice();
    }
}
