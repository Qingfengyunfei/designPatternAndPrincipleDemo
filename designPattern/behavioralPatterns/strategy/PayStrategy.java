package com.designPatternAndPrinciple.designPattern.behavioralPatterns.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 11:13
 * @since 1.0.0
 */
public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = "AliPay";

    private static Map<String, Payment> payStrategy = new HashMap<>();

    static {
        payStrategy.put(ALI_PAY, new AliPay());
        payStrategy.put(UNION_PAY, new UnionPay());
        payStrategy.put(WECHAT_PAY, new WechatPay());
        payStrategy.put(JD_PAY, new JDPay());
    }

    public static Payment get(String payKey) {
        if(!payStrategy.containsKey(payKey)){
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }
}
