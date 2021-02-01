package com.wwp.web;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1、T恤    2、网球鞋    3、网球拍");
        System.out.println("***********************************");
        System.out.println();
        int price = checkPrice(0);
        String priceRate = getConsoleIn();
        System.out.println("折扣：" + priceRate);
        System.out.println("应付金额："+price);
        int payPri = checkPayPrice(price);
        System.out.println("找零：" + (payPri-price));

    }

    private static int checkPayPrice(int price) {
        String payPrice = getConsoleIn();
        int payPriceInt = Integer.valueOf(payPrice);
        System.out.println("实付金额：" + payPriceInt);
        if(payPriceInt<price){
            System.out.println("您输入的金额小于应付金额，请重新输入：");
            payPriceInt = checkPayPrice(price);
        }
        return payPriceInt;
    }

    private static int checkPrice( int price) {
        System.out.print("请输入商品编号：");
        String no = getConsoleIn();
        System.out.print("请输入商品数量：");
        String sum = getConsoleIn();
        int intNo = Integer.valueOf(no);
        int intSum = Integer.valueOf(sum);
        int tempPrice = 0;
        int temp = 1;
        switch (intNo) {
            case 1:
                while (temp <= intSum) {
                    tempPrice += 245.0;
                    price += tempPrice;
                    temp++;
                }
                System.out.println("T恤￥245.0" + "  " + "数量" + sum + "  " + "合计  ￥" + tempPrice);
                break;
            case 2:
                while (temp <= intSum) {
                    tempPrice += 570.0;
                    price += tempPrice;
                    temp++;
                }
                System.out.println("网球鞋￥245.0" + "  " + "数量" + sum + "  " + "合计  ￥" + tempPrice);
                break;
            case 3:
                while (temp <= intSum) {
                    tempPrice += 570.0;
                    price += tempPrice;
                    temp++;
                }
                System.out.println("网球拍￥245.0" + "  " + "数量" + sum + "  " + "合计  ￥" + tempPrice);
                break;
        }
        System.out.println("是否继续（y/n）:");
        String goOrNo = getConsoleIn();
        if(goOrNo.equals("y")){
            price = checkPrice(price);
        }
        return price;
    }

    private static String getConsoleIn() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}
