package com.spring.framwork.interfacese.impl;

import com.spring.framwork.interfacese.IAccountService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk动态代理
 * 实现jdk的invocationHandler接口
 * 重写invoke方法
 * 中间可有参加些自己需要的业务逻辑
 */
public class AccountAdvice implements InvocationHandler {

    private IAccountService target;

    public AccountAdvice(IAccountService target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beafor();
        return method.invoke(target,args);
    }
    /**
     * 前置
     */
    private void beafor() {
        System.out.println("前置增强：动态代理：业务需要可进行相应变更---------");
    }
}
