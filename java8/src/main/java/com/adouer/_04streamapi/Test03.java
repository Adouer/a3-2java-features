package com.adouer._04streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test03 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "apple");

        List<String> result = list.stream()
                .filter(s -> s.length() > 5) // 过滤出长度大于5的元素：[banana, cherry]
                .map(String::toUpperCase) // 转换为大写字母 ：[BANANA, CHERRY]
                .flatMap(s -> Arrays.stream(s.split(""))) // 将字符串拆分为字符 ：[B, A, N, A, N, A, C, H, E, R, R, Y]
                .distinct() // 去除重复的字符 ：[B, A, N, C, H, E, R, Y]
                .sorted() // 排序 ：[A, B, C, E, H, N, R, Y]
                .peek(System.out::print) // 打印出字符：ABCEHNRY[A, B, C, E, H, N, R, Y]
                .limit(3) // 取前3个字符 :ABC[A, B, C]
                .skip(1) // 跳过前1个字符 :ABC[B, C]
                .parallel() // 启用并行处理
                .sequential() // 禁用并行处理
                .collect(Collectors.toList()); // 转换为List对象
//              .toList(); // 16之后可以这样转换为List对象
        System.out.println(result); // 输出 ABC[B, C]
    }
}