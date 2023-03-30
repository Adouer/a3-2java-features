package com.adouer._07optional;

import java.util.Optional;

/**
 * 创建Optional类
 */
public class Test01 {
    public static void main(String[] args) {
        // 声明一个空Optional
        Optional<Object> empty = Optional.empty();

        // 依据一个非空值创建Optional
        Student student = new Student();
        Optional<Student> os1 = Optional.of(student);

        // 可接受null的Optional
        Student student1 = null;
        Optional<Student> os2 = Optional.ofNullable(student1);
    }
}
