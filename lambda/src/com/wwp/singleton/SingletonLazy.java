package com.wwp.singleton;

public class SingletonLazy {

    private static SingletonLazy singletonLazy = null;

    private SingletonLazy(){
//        System.out.println("========");
    }

    public static SingletonLazy getInstance(){
        if(singletonLazy == null){
            synchronized (SingletonLazy.class){
                if(singletonLazy == null){
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
