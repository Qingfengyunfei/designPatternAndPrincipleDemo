package com.designPrinciples.CRP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 17:23
 * @since 1.0.0
 */
public abstract class DBConnection {
    /**
     * 抽象方法获取数据库连接
     *
     * @return
     */
    public abstract String getConnection();
}
