package com.wwp.builder;

/**
 * @author wwp
 * @version 1.0.0
 * @ClassName Builder.java
 * @Description 建造者
 * @createTime 2021年07月16日 14:54:00
 */
public interface Builder<T> {

    void buildType(Type type);

    void buildName(String name);
}
