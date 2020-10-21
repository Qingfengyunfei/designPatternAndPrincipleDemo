package com.designPatternAndPrinciple.designPattern.behavioralPatterns.strategy;

/**
 * @author Administrator
 * @description 支付状态类
 * @create 2020/10/21 11:07
 * @since 1.0.0
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return ("支付状态:["+code+"],"+msg+",交易详情："+data);
    }
}
