package com.adouer._01functioninterface;

public class Test {
    public static void main(String[] args) {
        //创建实例方式一---内部类
        MyFunctionInterface functionInterface = new MyFunctionInterface() {
            @Override
            public void sayHello() {
                System.out.println("hello");
            }
        };
        //创建实例方式二---lambda
        MyFunctionInterface functionInterface1 = () -> {
            System.out.println("hello");
        };

        //使用
        functionInterface.sayHello();
        functionInterface1.sayHello();
    }
}
