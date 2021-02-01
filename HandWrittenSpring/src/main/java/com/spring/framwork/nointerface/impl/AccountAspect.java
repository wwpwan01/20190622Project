package com.spring.framwork.nointerface.impl;

import com.spring.framwork.nointerface.BaseAspect;

import java.lang.reflect.Method;

public class AccountAspect extends BaseAspect {
    /**
     * 切入点增强
     * @param method
     * @param objects
     * @return
     */
    @Override
    public boolean isIntercept(Method method, Object[] objects) {
        return method.getName().equals("transfer");
    }
    /**
     * 前置增强
     */
    @Override
    public void beafor() {
        System.out.println("前制增强：模拟spring=========");
    }
}
