package com.designPrinciples.CRP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 17:25
 * @since 1.0.0
 */
public class OracleConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "Oracle数据库连接";
    }
}
