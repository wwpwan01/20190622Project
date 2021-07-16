package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName HaiErFactory.java
 * @Description 海尔工厂
 * @createTime 2021年07月15日 17:23:00
 */
public class HaiErFactory implements AbstractFactory {

    @Override
    public AirConditioner createAirConditioner() {
        return new HaierAirConditioner();
    }

    @Override
    public Television createTelevision() {
        return new HaierTCLTelevision();
    }

    @Override
    public Phone createPhone() {
        return new HaierPhone();
    }
}
