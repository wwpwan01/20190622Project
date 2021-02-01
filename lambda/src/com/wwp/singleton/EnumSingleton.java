package com.wwp.singleton;

public enum EnumSingleton {
    INSTANCE;

    private static final Vehicle vehicle = new Vehicle();

    public static Vehicle getInstance(){
        return vehicle;
    }
}
