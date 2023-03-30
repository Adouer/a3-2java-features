package com.adouer._02lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 使用Lambda表达式对列表进行排序
public class Test02 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> sortedFruits = fruits.stream()
                                          .sorted((x, y) -> Integer.compare(x.length(), y.length()))
                                          .collect(Collectors.toList());
        System.out.println(sortedFruits); // 输出 [date, apple, banana, cherry]
    }
}