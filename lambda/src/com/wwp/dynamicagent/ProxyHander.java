package com.wwp.dynamicagent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class ProxyHander implements InvocationHandler {
    private Persion persion;

    public ProxyHander(Persion persion) {
        this.persion = persion;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(persion,args);
        return persion;
    }
}