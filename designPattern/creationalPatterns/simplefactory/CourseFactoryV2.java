package com.designPatternAndPrinciple.designPattern.creationalPatterns.simplefactory;


/**
 * @author Administrator
 * @description v2.0 使用反射技术来优化ICourse简单工厂
 * @create 2020/9/21 17:14
 * @since 1.0.0
 */
public class CourseFactoryV2 {
    /**
     * 通过类名称创建
     * @param className
     * @return
     */
    public static ICourse createStaticByClassName(String className) {
        if (!(null == className || "".equals(className))) {
            try {
                return (ICourse) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 通过具体类创建
     * @param clazz
     * @return
     */
    public static ICourse createStaticByClass(Class<? extends ICourse> clazz) {
        if (clazz != null) {
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
