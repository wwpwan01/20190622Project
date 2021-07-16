package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName HaierAirConditioner.java
 * @Description TODO
 * @createTime 2021年07月15日 17:23:00
 */
public class HaierAirConditioner implements AirConditioner {

    @Override
    public void show(){
        System.out.println("你用haier工厂创造了一个海尔空调！");
    }
}
