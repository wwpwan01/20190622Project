package com.spring.framwork.nointerface.impl;

import com.spring.framwork.nointerface.IAccountService;

/**
 * 模拟springFactory
 */
public class AccountService implements IAccountService {
    public void transfer(){
        System.out.print("业务需要输出Dao层");
    }
}
