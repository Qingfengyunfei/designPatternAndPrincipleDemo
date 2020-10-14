package com.designPatternAndPrinciple.designPattern.structuralPatterns.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 * @description 静态代理测试
 * @create 2020/10/14 16:11
 * @since 1.0.0
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = new OrderServiceStaticProxy(new OrderServiceImpl());
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
