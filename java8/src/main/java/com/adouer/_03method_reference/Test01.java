package com.adouer._03method_reference;

import java.util.ArrayList;
import java.util.List;

/**
 * 方法引用【::】
 */
public class Test01 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("xw", 18));
        list.add(new User("xz", 34));
        list.add(new User("xl", 19));
        list.add(new User("lh", 24));
        list.add(new User("lp", 31));

        /**
         * 构造器方法引用
         */
        //User.create(() -> new User());
        User newUser = User.create(User::new);

        newUser.setAge(1);
        newUser.setName("new");
        System.out.println(newUser);

        /**
         * 类静态方法引用
         */
        //list.forEach(user -> User.updateUserName(user));
        list.forEach(User::updateUserName);
        /**
         * 类普通方法引用
         */
        //list.forEach(user -> user.updateAge());
        list.forEach(User::updateAge);
        /**
         * 实例方法引用
         */
        User user = new User();
        //list.forEach(user1 -> user.changeAge(user1));
        list.forEach(user::changeAge);
        //list.forEach(user1 -> System.out.println(user1));
        list.forEach(System.out::println);
    }
}
