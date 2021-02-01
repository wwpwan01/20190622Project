package com.spring.framwork.nointerface;

import com.spring.framwork.nointerface.impl.AccountService;
import com.spring.framwork.nointerface.impl.AccountAspect;
import com.spring.framwork.nointerface.impl.ProxyFactory;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        IAccountService target = new AccountService();
        //切面
        BaseAspect baseAspect = new AccountAspect();
        //创建代理对象
        IAccountService proxy = (AccountService) ProxyFactory.creatproxy(target.getClass(),baseAspect);
        proxy.transfer();
    }
    /*public static void main(String[] args) {
        //创建目标对象
        AccountService target = new AccountService();
        //
        //创建代理对象
        AccountService proxy = (AccountService) Enhancer.create(target.getClass(),
                new AccountAdvice());
        proxy.transfer();
    }*/
}
