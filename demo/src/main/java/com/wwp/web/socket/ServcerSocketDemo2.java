package com.wwp.web.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServcerSocketDemo2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            byte[] bytes = new byte[1024];
            int read = inputStream.read(bytes);
            if(read != -1){
                System.out.println(new String( bytes,0,read));
            }
            accept.shutdownInput();
            OutputStream outputStream = accept.getOutputStream();
            outputStream.write("收到了".getBytes());
            accept.shutdownOutput();
//            byte[] bytes = new byte[1024];
//            int read = inputStream.read(bytes);
//            while (read != -1){
//                System.out.println(read);
//            }
            outputStream.close();
            inputStream.close();
            accept.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
