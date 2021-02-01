package com.wwp.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,4,6,3,8,9,4,2);
//        Optional<Integer> listStream = integerList.stream().filter(i -> {
//            System.out.println("开始玩了");
//            return i % 2 == 0;
//        }).findAny();
//        System.out.println(listStream.get());

//        Optional<Integer> first = integerList.stream().sorted().findFirst();
//        integerList.stream().sorted().forEach(System.out::println);
//        System.out.println(first.get());

        List<Integer> collect = integerList.stream().sorted().filter(x -> x % 2 == 0).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println(integerList.stream().mapToInt(Integer::intValue).sum());
    }
}
