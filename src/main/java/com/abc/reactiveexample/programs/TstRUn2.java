package com.abc.reactiveexample.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TstRUn2 {



    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> collect = list.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("Welcome");
    }
}
