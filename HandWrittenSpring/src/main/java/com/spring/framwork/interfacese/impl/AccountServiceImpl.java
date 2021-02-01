package com.spring.framwork.interfacese.impl;

import com.spring.framwork.interfacese.IAccountService;

public class AccountServiceImpl implements IAccountService {

    @Override
    public void transfer() {
        System.out.println("对转账人身份进行验证======");

        System.out.println("调用dao层,完成转账主业务======");
    }
}
