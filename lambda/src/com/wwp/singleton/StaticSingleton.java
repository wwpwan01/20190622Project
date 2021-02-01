package com.wwp.singleton;

public class StaticSingleton {
    private StaticSingleton() {
    }

    private static class StaticSingletonHandler{
        private static final StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return StaticSingletonHandler.instance;
    }
}
