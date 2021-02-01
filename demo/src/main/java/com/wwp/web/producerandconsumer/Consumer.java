package com.wwp.web.producerandconsumer;

public class Consumer implements Runnable{
    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%2 ==0){
                System.out.println("消费者消费"+goods.getBrand()+"---"+goods.getName());
            }else {
                System.out.println("消费者消费"+goods.getBrand()+"---"+goods.getName());
            }
        }
    }
}
