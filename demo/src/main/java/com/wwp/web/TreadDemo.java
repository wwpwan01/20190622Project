package com.wwp.web;

public class TreadDemo extends Thread {

    private int i = 100;

    @Override
    public void run(){
        for (int i =0; i<= 100 ; i++){
            if(i > 0 && i % 2 ==0){
                System.out.println(Thread.currentThread().getName() + "取得" + i);
            }
        }
    }

    public static void main(String[] args) {
        TreadDemo treadDemo = new TreadDemo();
        TreadDemo treadDemo1 = new TreadDemo();
        treadDemo.start();
        treadDemo1.start();
    }
}
