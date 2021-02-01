package com.wwp.web.producerandconsumer;

public class ProducerAndConsumerDemo {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
