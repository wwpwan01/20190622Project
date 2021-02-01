package com.wwp;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年11月10日 11:06:00
 */
public class Test<T> {
    private final LinkedList<T> list = new LinkedList<T>();
    private final int MAX=10;
    private int count = 0;

    public synchronized void add(T t){
        while (list.size() == MAX){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(t);
        ++count;
        this.notifyAll();
    }

    public synchronized T get(){
        T t = null;
        while (list.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        t = list.removeFirst();
        count--;
        this.notifyAll();
        return t;
    }

    public static void main(String[] args) {
        Test<String> test = new Test<String>();
        for (int i = 0 ;i <2 ;i++){
            new Thread(()->{
                for( int j =0 ; j <10 ;j++){
                    test.add(Thread.currentThread().getName() + " " +j);
                    System.out.println("生产：" +Thread.currentThread().getName() + " " +j);
                }
            }, "c" + i).start();
        }
        /*try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        for (int i = 0 ;i <2 ;i++){
            new Thread(()->{
                for( int j =0 ; j <10 ;j++){
                    System.out.println(test.get());

                }
            }, "P" + i).start();
        }

    }
}
