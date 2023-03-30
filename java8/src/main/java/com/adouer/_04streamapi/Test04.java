package com.adouer._04streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 常用终端操作
 */
public class Test04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        list.stream().forEach(System.out::println);

        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        long count = list1.stream().count();
        System.out.println("Count: " + count);

        List<String> list2 = Arrays.asList("apple", "banana", "orange");
        List<String> newList = list2.stream().collect(Collectors.toList());

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        //sum==0, sum=sum+i 【i从list里遍历】
        int sum = list3.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        List<String> list4 = Arrays.asList("apple", "banana", "orange");
        Optional<String> first = list4.stream().findFirst();
        if (first.isPresent()) {
            System.out.println("First: " + first.get());
        }

    }
}
