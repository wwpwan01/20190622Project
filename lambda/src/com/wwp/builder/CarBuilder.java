package com.wwp.builder;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName CarBuilder.java
 * @Description 建造器
 * @createTime 2021年07月16日 14:58:00
 */
public class CarBuilder implements Builder{

    private Car car = new Car();

    @Override
    public void buildType(Type type) {
        car.setType(type);
        System.out.println(car.toString());
    }

    @Override
    public void buildName(String name) {
        car.setName(name);
        System.out.println(car.toString());
    }
}
