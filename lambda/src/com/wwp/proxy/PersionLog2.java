package com.wwp.proxy;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName PersionLog.java
 * @Description TODO
 * @createTime 2020年10月29日 22:18:00
 */
public class PersionLog2 implements DoThing {
    /*
        聚合一个persion类
     */
    DoThing doThing;

    public PersionLog2(DoThing doThing) {
        this.doThing = doThing;
    }

    @Override
    public void isRunning() {
        System.out.println("log============");
        doThing.isRunning();
        System.out.println("log---------------");
    }

    @Override
    public void isSleeping() {

    }
}
