package com.wwp.web;

public class RunnableDemo implements Runnable {
    private int t = 100;

    @Override
    public void run(){

            for (int i =0; i<= t ; i++){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this) {
                    if (i > 0 && i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + "取得" + i);
                    }
                }
        }
    }

    public static void main(String[] args) {
        RunnableDemo treadDemo = new RunnableDemo();
        Thread thread1 = new Thread(treadDemo);
        Thread thread2 = new Thread(treadDemo);
        thread1.start();
        thread2.start();
    }
}
