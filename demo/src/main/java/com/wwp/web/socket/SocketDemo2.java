package com.wwp.web.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDemo2 {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost",10000);
            OutputStream outputStream = client.getOutputStream();
            outputStream.write("hollo everyone".getBytes());
            client.shutdownOutput();
            InputStream inputStream = client.getInputStream();
            byte[] bytes = new byte[1024];
            int read = inputStream.read(bytes);
            if(read != -1){
                System.out.println(new String(bytes,0,read));
            }
            client.shutdownInput();
            inputStream.close();
            outputStream.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
