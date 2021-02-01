package com.wwp.web;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetDemo {
    public static void main(String[] args) {
        InetAddress loopbackAddress = null;
        try {
            loopbackAddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(loopbackAddress);
    }
}
