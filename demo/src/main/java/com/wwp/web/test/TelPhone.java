package com.wwp.web.test;

public abstract class TelPhone {

    private String name;
    private String id;

    public TelPhone(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public TelPhone() {
    }

    public void sendMessage(){
        System.out.println("短信");
    }
    public void cal(){
        System.out.println("电话");
    }
    public void info(){
        System.out.println("呵呵");
    }
}
