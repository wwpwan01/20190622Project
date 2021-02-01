package com.wwp.proxy;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PersionLog.java
 * @Description TODO
 * @createTime 2020年10月29日 22:18:00
 */
public class PersionLog implements DoThing {
    /*
        聚合一个persion类
     */
    Persion persion;

    public PersionLog(Persion wangwu) {
        this.persion = wangwu;
    }

    @Override
    public void isRunning() {
        System.out.println("log============");
        persion.isRunning();
        System.out.println("log---------------");
    }

    @Override
    public void isSleeping() {

    }
}
