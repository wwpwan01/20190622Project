package com.wwp.web.producerandconsumer;

public class Producer implements Runnable {

    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i=0; i < 10; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%2 ==0){
                goods.setBrand("娃哈哈");
                goods.setName("矿泉水");
            }else {
                goods.setBrand("旺仔");
                goods.setName("牛奶");
            }
            System.out.println("生产者生产"+goods.getBrand()+"---"+goods.getName());
        }
    }
}
