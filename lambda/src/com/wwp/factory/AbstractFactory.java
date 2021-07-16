package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName AbstractFactory.java
 * @Description 工厂
 * @createTime 2021年07月15日 16:36:00
 */
public interface AbstractFactory {

    AirConditioner createAirConditioner();

    Television createTelevision();

    Phone createPhone();
}
