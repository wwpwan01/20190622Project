package com.wwp.builder;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 建造者测试
 * @createTime 2021年07月16日 15:14:00
 */
public class Test {
    public static void main(String[] args) {

        Builder builder = new CarBuilder();
        builder.buildName("paste");
        builder.buildType(Type.ONE);
        System.out.println(builder.toString());
    }
}
