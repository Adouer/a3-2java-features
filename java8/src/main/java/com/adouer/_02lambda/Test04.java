package com.adouer._02lambda;

import java.util.function.BiFunction;

// 使用Lambda表达式进行简单计算
public class Test04 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        int result = add.apply(3, 5);
        System.out.println(result); // 输出 8
    }
}