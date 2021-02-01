package com.wwp.singleton;

public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("========");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
