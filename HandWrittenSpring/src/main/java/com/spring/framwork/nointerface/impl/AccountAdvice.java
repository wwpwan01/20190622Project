package com.spring.framwork.nointerface.impl;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cjlib动态代理
 * 需要实现methodinterceptor接口
 */
public class AccountAdvice implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        beafor();
        //return method.invoke(obj,objects);//会报错
        return methodProxy.invokeSuper(obj,objects);
    }

    private void beafor() {
        System.out.println("拦截器增强：====");
    }
}
