package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName TCLAirConditioner.java
 * @Description TODO
 * @createTime 2021年07月15日 17:24:00
 */
public class TCLAirConditioner implements AirConditioner {

    @Override
    public void show() {
        System.out.println("你用TCL工厂创造了一个TCL空调！");
    }
}
