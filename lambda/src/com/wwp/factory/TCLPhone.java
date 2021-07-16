package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName TCLPhone.java
 * @Description TODO
 * @createTime 2021年07月16日 09:43:00
 */
public class TCLPhone implements Phone {

    @Override
    public void show() {
        System.out.println("你用TCL工厂创造了一个TCL手机！");
    }
}
