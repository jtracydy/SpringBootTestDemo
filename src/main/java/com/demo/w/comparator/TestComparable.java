package com.demo.w.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("4");
        list.add("2");
        list.add("1");
        list.add("3");

        Collections.sort(list);
        System.out.println(list);

        List<User> users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(11);
        u1.setName("lucas");
        users.add(u1);
        User u2 = new User();
        u2.setAge(33);
        u2.setName("tiger");
        users.add(u2);
        User u3 = new User();
        u3.setAge(22);
        u3.setName("tracy");
        users.add(u3);

        Collections.sort(users);
        System.out.println(users.get(0).getAge());
        System.out.println(users.get(1).getAge());
        System.out.println(users.get(2).getAge());
    }
}
