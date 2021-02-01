package com.spring.framwork.nointerface.impl;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class ProxyFactory {
    @SuppressWarnings("unchecked")
    public static <T> T creatproxy(final Class<?> tragetClass, final MethodInterceptor methodInterceptor){
        return (T) Enhancer.create(tragetClass,methodInterceptor);
    }
}
