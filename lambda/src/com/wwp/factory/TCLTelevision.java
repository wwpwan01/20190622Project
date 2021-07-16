package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName TCLTelevision.java
 * @Description TODO
 * @createTime 2021年07月15日 17:21:00
 */
public class TCLTelevision implements Television {

    @Override
    public void show() {
        System.out.println("你用TCL工厂创造了一个TCL电视！");
    }
}
