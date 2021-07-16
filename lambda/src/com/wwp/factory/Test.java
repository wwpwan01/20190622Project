package com.wwp.factory;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021年07月16日 10:34:00
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new HaiErFactory();
        abstractFactory.createAirConditioner().show();
        abstractFactory.createTelevision().show();
        abstractFactory.createPhone().show();
        abstractFactory = new TCLFactory();
        abstractFactory.createTelevision().show();
        abstractFactory.createAirConditioner().show();
        abstractFactory.createPhone().show();
    }
}
