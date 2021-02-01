package com.wwp.web;

public class RunnableDemo2 implements Runnable {

    private int seatArea = 5;

    @Override
    public void run() {
        for (int i = 0; i< 100; i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test();
        }
    }

    private synchronized void test() {
        if(seatArea > 0){
            System.out.println(Thread.currentThread().getName() +"抢到第："+ (seatArea--));
        }
    }

    public static void main(String[] args) {
        RunnableDemo2 runnableDemo2 = new RunnableDemo2();
        Thread thread = new Thread(runnableDemo2);
        Thread thread1 = new Thread(runnableDemo2);
        thread1.setName("线程1");
        thread.start();
        thread1.start();

    }
}
