package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName TCLFactory.java
 * @Description TCL工厂
 * @createTime 2021年07月15日 17:20:00
 */
public class TCLFactory implements AbstractFactory {
    @Override
    public AirConditioner createAirConditioner() {
        return new TCLAirConditioner();
    }

    @Override
    public Television createTelevision() {
        return new TCLTelevision();
    }

    @Override
    public Phone createPhone() {
        return new TCLPhone();
    }
}
