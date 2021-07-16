package com.wwp.factoryMethod;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Phone.java
 * @Description TODO
 * @createTime 2021年07月16日 10:50:00
 */
public class Phone implements Product {
    @Override
    public void show() {
        System.out.println("手机");
    }
}
