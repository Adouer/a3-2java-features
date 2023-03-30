package com.adouer._02lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 使用Lambda表达式过滤列表
public class Test03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(x -> x % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println(evenNumbers); // 输出 [2, 4, 6, 8, 10]
    }
}