package com.wwp.web.test;

public class AptitudeHandset extends TelPhone implements NetWork,TakePictures,PlayWring {
    @Override
    public void netWorkConn() {
        System.out.println("智能手机上网");
    }

    @Override
    public void takePicture() {
        System.out.println("智能手机拍照");
    }

    @Override
    public void playWring() {
        System.out.println("智能手机放音乐");
        Integer i = 10;
        int ia = 1;
        i = Integer.valueOf(1);
    }
}
