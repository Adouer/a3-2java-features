package com.adouer._04streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 创建流的常用方式
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");
        Stream<String> stream = list.stream(); //顺序流
        Stream<String> stream1 = list.parallelStream(); //并行流

        int[] array = {1, 2, 3, 4, 5};
        IntStream stream2 = Arrays.stream(array);

        //创建一个由0开始，每次加2的等差数列，然后取前5个元素，
        Stream<Integer> stream3 = Stream.iterate(0, n -> n + 2)
                .limit(5);

        //生成随机数取5个
        Stream<Double> stream4 = Stream.generate(Math::random)
                .limit(5);
    }
}
