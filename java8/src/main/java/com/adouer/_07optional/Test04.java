package com.adouer._07optional;

import java.util.Optional;

/**
 * 映射
 */
public class Test04 {
    public static void main(String[] args) {
        Student student = new Student("李四", 3);
        Optional<Student> os1 = Optional.ofNullable(student);
        // 如果student对象不为空，就加一岁
        Optional<Student> emp = os1.map(e ->
        {
            e.setAge(e.getAge() + 1);
            return e;
        });
        System.out.println(emp);
    }
}
