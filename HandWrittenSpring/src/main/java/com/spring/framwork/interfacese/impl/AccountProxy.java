package com.spring.framwork.interfacese.impl;

import com.spring.framwork.interfacese.IAccountService;

/**
 * 静态代理
 * 私有化实现的接口，公共化自己的类
 * 重写interface的方法即可
 */
public class AccountProxy implements IAccountService {
    //目标对象
    private IAccountService target;

    public AccountProxy(IAccountService target) {
        this.target = target;
    }
    /**
     * 代理方法,实现对目标方法的功能增强
     */
    @Override
    public void transfer() {
        before();
        target.transfer();
    }
    /**
     * 身份验证
     */
    private void before() {
        System.out.println("前置增强：静待代理：增加++++++++");
    }
}
