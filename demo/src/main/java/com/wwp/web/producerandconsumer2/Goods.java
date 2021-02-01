package com.wwp.web.producerandconsumer2;

public class Goods {
    private String brand;
    private String name;
    private boolean flag = false;

    public Goods() {
    }

    public Goods(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public synchronized void get() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("消费者消费" + this.getBrand() + "---" + this.getName());
        flag = false;
        notify();
    }

    public synchronized void set(String brand, String name) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBrand(brand);
        this.setName(name);
        System.out.println("生产者生产" + this.getBrand() + "---" + this.getName());
        flag = true;
        notify();
    }
}
