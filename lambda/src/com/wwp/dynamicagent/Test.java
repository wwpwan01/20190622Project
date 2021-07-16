package com.wwp.dynamicagent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 动态代理
 * @createTime 2021年07月16日 16:17:00
 */
public class Test {

    public static void main(String[] args) {

        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        InvocationHandler i = new ProxyHander(new Persion("lisi"));
        DoThing p = (DoThing) Proxy.newProxyInstance(DoThing.class.getClassLoader(),new Class[]{DoThing.class},i);
        p.isRunning();
    }
}
