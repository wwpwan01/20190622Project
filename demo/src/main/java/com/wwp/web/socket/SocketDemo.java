package com.wwp.web.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDemo {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost",10000);
            OutputStream outputStream = client.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("hollo everyone");
            dataOutputStream.close();
            outputStream.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
