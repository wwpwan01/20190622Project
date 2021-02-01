package com.wwp.proxy;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Persion.java
 * @Description TODO
 * @createTime 2020年10月28日 22:52:00
 */
public class Persion  implements DoThing{
    private String persionName;

    public String getPersionName() {
        return persionName;
    }

    public void setPersionName(String persionName) {
        this.persionName = persionName;
    }

    public Persion() {
    }

    public Persion(String persionName) {
        this.persionName = persionName;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "persionName='" + persionName + '\'' +
                '}';
    }

    @Override
    public void isRunning() {
        System.out.println(this.persionName + " is running");
    }

    @Override
    public void isSleeping() {
        System.out.println(this.persionName + " is sleeping");
    }
}
