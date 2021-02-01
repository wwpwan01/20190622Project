package com.wwp.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//        list.add("111");
//        list.add("232");
//        list.add("43");
//        list.add("54");
//        list.add("5465");
//        list.add("567467345");
////        BigStr bigStr = new BigStr() {
////            @Override
////            public boolean getBigStr(String string) {
////                return string.length() > 5;
////            }
////        };
////        System.out.println(bigStr.getBigStr(list.get(0)));
//
////        list.forEach(System.out::print);
//
////        Collections.sort(list);
//
//        Supplier<String> s1 = ()-> LambdaDemo.printStr(list);
//        System.out.println(s1.get());
//        Supplier<String> s2 = LambdaDemo::printStr;

//        System.out.println(s2.get());
//        Consumer<String> s3 = LambdaDemo::printStrSize;
//        s3.accept("adsfc");

        Consumer<Integer> s4 = (size) -> LambdaDemo.printStrSize2(size);
        s4.accept(123);
//        getBigStr(list,(e) -> e.startsWith("2"));

        Function<String,String> f2 = str -> str.toUpperCase();
        Function<String,Integer> f1 = str -> LambdaDemo.printStrSize(str);
        Function<String,String> f3 = LambdaDemo::printStrSize3;

    }

    public static void getBigStr(List<String> list, BigStr bigStr) {
        List<String> liststr = new ArrayList<String>();
        for (String str : list){
            if(bigStr.getBigStr(str)){
                liststr.add(str);
            }
        }
        printStr(liststr);
    }

    public static String printStr(){
        return "这个是个标识";
    }

    public static String printStr(List<String> liststr) {
        for (String str :liststr){
            System.out.println(str);
        }
        return String.valueOf(liststr.size());
    }

    public static int printStrSize(String string){
        System.out.println(string);
        return string.length();
    }
    public static void printStrSize2(int string){
        System.out.println(string);
    }

    public static String printStrSize3(String string){
        System.out.println(string);
        return string.toUpperCase();
    }
}
