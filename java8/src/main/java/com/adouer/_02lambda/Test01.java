package com.adouer._02lambda;

import java.util.function.Function;

/**
 * 使用Lambda表达式作为函数参数
 */
public class Test01 {
    public static void main(String[] args) {
        int result = applyFunction(3, x -> x + 2);
        System.out.println(result); // 输出 5
    }

    public static int applyFunction(int x, Function<Integer, Integer> func) {
        return func.apply(x);
    }
}
