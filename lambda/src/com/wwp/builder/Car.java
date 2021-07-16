package com.wwp.builder;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Car.java
 * @Description 实体
 * @createTime 2021年07月16日 14:59:00
 */
public class Car {
    private Type type;
    private String name;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
}
