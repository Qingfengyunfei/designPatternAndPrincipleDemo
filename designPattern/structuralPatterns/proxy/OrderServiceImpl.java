package com.designPatternAndPrinciple.designPattern.structuralPatterns.proxy;

/**
 * @author Administrator
 * @description
 * @create 2020/10/14 15:01
 * @since 1.0.0
 */
public class OrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public OrderServiceImpl() {
        //spring中应该会自动注入
        //此处仅使用初始化
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService 适用orderDao 创建订单");
        return orderDao.insert(order);
    }
}
