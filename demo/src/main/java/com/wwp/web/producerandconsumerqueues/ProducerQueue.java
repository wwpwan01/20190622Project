package com.wwp.web.producerandconsumerqueues;

import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable {

    private BlockingQueue<Goods> blockingQueue;

    public ProducerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i=0; i < 10; i++){
//            System.out.println("生产者生产"+blockingQueue..getBrand()+"---"+goods.getName());
            Goods goods = null;
            if(i%2 ==0){
                goods = new Goods("娃哈哈","矿泉水");
            }else {
                goods = new Goods("旺仔","牛奶");
            }

            try {
                blockingQueue.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("生产者生产"+goods.getBrand() + "----" +goods.getName());
        }
    }
}
