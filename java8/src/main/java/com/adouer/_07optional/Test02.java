package com.adouer._07optional;

import java.util.Optional;

/**
 * 获取Optional容器的对象
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        Student student = null;
        Optional<Student> os1 = Optional.ofNullable(student);
        // 使用get一定要注意，假如student对象为空，get是会报错的
        // java.util.NoSuchElementException: No value present
        Student student1 = os1.get();

        // 当student为空的时候,返回我们新建的这个对象,有点像三目运算的感觉
        Student student2 = os1.orElse(new Student("张三", 18));

        // orElseGet就是当student为空的时候，返回通过Supplier供应商函数创建的对象
        Student student3 = os1.orElseGet(() -> new Student("张三", 18));

        // orElseThrow就是当student为空的时候，可以抛出我们指定的异常
        os1.orElseThrow(() -> new Exception());
    }
}
