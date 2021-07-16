package com.wwp.factoryMethod;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Factory1.java
 * @Description TODO
 * @createTime 2021年07月16日 10:49:00
 */
public class AirFactory implements AbstractFactory {
    @Override
    public Product getProdutct() {
        return new Air();
    }
}
