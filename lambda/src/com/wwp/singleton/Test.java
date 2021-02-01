package com.wwp.singleton;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        Singleton vehicle = Singleton.getInstance();
//        Singleton vehicle2 = Singleton.getInstance();
        SingletonLazy enumSingleton = SingletonLazy.getInstance();

//        System.out.println(enumSingleton.hashCode());
//        System.out.println(enumSingleton);
//        System.out.println(enumSingleton2.hashCode());
//        System.out.println(enumSingleton2);
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            threads.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonLazy enumSingleton2 = SingletonLazy.getInstance();
                    if (enumSingleton.hashCode() != enumSingleton2.hashCode()) {
                        System.out.println("======================");
                    }else {
//                        System.out.println("-------------");
                    }
                }
            }));
        }
        threads.forEach((e) -> e.start());
    }
}
