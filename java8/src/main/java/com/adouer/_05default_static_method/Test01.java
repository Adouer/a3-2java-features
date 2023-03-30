package com.adouer._05default_static_method;

/**
 * 测试默认方法和静态方法
 */
public class Test01 implements MyInterface {
    public static void main(String[] args) {
        Test01 obj = new Test01();
        //调用默认方法
        obj.myDefaultMethod();
        //调用静态方法
        MyInterface.myStaticMethod();
    }
}
