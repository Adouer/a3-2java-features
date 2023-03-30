package com.adouer._01functioninterface;

import java.util.function.Supplier;

/**
 * 供给型接口，没有输入类型，有返回值
 */
public class SupplierDemo {
    public static void main(String[] args) {
        /*//匿名内部类
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                System.out.println("Supplier");
                return 123;
            }
        };*/
        Supplier<Integer> supplier = ()->{
            System.out.println("Supplier");
            return 123;
        };
        System.out.println(supplier.get());
    }
}