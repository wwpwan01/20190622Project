package com.wwp.web;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = 0 ;
        if(num > 0){
            for (int i = 0 ; i<= num; i++){
                if(i == 0){
                    temp = 1;
                }else {
                    temp = i*temp;
                }
            }
        }
        System.out.println(temp);
    }
}
