package com.wwp.factoryMethod;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021年07月16日 10:51:00
 */
public class Test {
    public static void main(String[] args) {

        AbstractFactory abstractFactory = new PhoneFactory();
        Product produtct = abstractFactory.getProdutct();
        produtct.show();
    }
}
