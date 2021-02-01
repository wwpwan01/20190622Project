package com.wwp.web;

import java.io.*;

public class StreamDemo {
    public static void main(String[] args) {
        InputStream inputStream = null;
        File file = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("C:\\Users\\40873\\Desktop\\山东保费计算.txt");
            int length = 0;
            byte[] lengthByte = new byte[1024];
//            while ((length = inputStream.read(lengthByte)) != -1){
//                System.out.println(new String(lengthByte,0,length));
//            }
            file = new File("C:\\Users\\40873\\Desktop\\aa.txt");
//            if (!file.exists()){
//                file.mkdirs();
//            }
            outputStream = new FileOutputStream(file);
            while ((length = inputStream.read(lengthByte)) != -1){
                outputStream.write(lengthByte,0,length);
                System.out.println(new String(lengthByte,0,length));
            }
//            int read = inputStream.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
