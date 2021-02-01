package com.spring.framwork.interfacese;

import com.spring.framwork.interfacese.impl.AccountAdvice;
import com.spring.framwork.interfacese.impl.AccountProxy;
import com.spring.framwork.interfacese.impl.AccountServiceImpl;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        //创建目标对象
        IAccountService target = new AccountServiceImpl();
        //创建代理对象
        IAccountService proxy = (IAccountService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new AccountAdvice(target)
        );
        proxy.transfer();
    }
}
class Client2 {
    public static void main(String[] args) {
        //创建目标对象
        IAccountService target = new AccountServiceImpl();
        //创建代理对象
        AccountProxy proxy = new AccountProxy(target);
        proxy.transfer();
    }
}