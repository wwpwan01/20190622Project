package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName HaierPhone.java
 * @Description TODO
 * @createTime 2021年07月16日 09:42:00
 */
public class HaierPhone implements Phone {

    @Override
    public void show() {
        System.out.println("你用haier工厂创造了一个海尔手机！");
    }
}
