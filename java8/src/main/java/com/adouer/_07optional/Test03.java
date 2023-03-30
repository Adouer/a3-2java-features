package com.adouer._07optional;

import java.util.Optional;

/**
 * 过滤
 */
public class Test03 {
    public static void main(String[] args) {
        Student student = new Student("李四", 3);
        Optional<Student> os1 = Optional.ofNullable(student);
        os1.filter(p -> p.getName().equals("李四")).ifPresent(x -> System.out.println("OK"));
    }
}
