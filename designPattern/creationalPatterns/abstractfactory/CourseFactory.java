package com.designPatternAndPrinciple.designPattern.creationalPatterns.abstractfactory;

/**
 * @author Administrator
 * @description 抽象工厂是用户的主入口 是Spring中应用最广泛的一种设计模式  弊端：当需要增加通用创建方法时需要对接口和实现类进行修改
 * @create 2020/9/23 17:21
 * @since 1.0.0
 */
public interface CourseFactory {
    /**
     * 创建笔记方法
     * @return INote
     */
    INote createNote();
    /**
     * 创建视频方法
     * @return IVideo
     */
    IVideo createVideo();
}
