package com.wwp.web.socket;

import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServcerSocketDemo {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            String s = dataInputStream.readUTF();
            System.out.println(s);

//            byte[] bytes = new byte[1024];
//            int read = inputStream.read(bytes);
//            while (read != -1){
//                System.out.println(read);
//            }
            dataInputStream.close();
            inputStream.close();
            accept.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
