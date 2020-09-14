package com.designPrinciples.CRP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 17:24
 * @since 1.0.0
 */
public class MySQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
