package com.wwp.strategy;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[] a = {1,5,3,6,8,2,7,0};
//        EatFood[] a = {new EatFood("馒头",3,""),new EatFood("咸菜",2,""),new EatFood("牛奶",1,"")};
        BreakFirst[] a = {new BreakFirst(9),new BreakFirst(5)};

        Sorter sorter = new Sorter();
        sorter.sort(a,new BreakFirstComparator());
        System.out.println(Arrays.toString(a));

    }
}
