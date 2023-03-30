package com.adouer._05default_static_method;

/**
 * 默认方法和静态方法
 */
public interface MyInterface {
    default void myDefaultMethod() {
        System.out.println("这是默认方法.");
    }
    static void myStaticMethod(){
        System.out.println("这是静态方法.");
    }
}
