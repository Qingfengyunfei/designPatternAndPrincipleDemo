package com.designPatternAndPrinciple.designPattern.extraPatterns.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 10:08
 * @since 1.0.0
 */
public class Leader implements IEmployee {

    private Map<String, IEmployee> targets = new HashMap<>();

    public Leader() {
        targets.put("加密", new EmployeeA());
        targets.put("登录", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
