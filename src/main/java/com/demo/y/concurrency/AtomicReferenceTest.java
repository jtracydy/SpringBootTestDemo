package com.demo.y.concurrency;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {

    private static AtomicReference<User> reference = new AtomicReference<>();

    public static void main(String[] args) {
        User user = new User();
        user.setAge(11);
        user.setName("lucas");
        User user1 = new User();
        user1.setAge(111);
        user1.setName("lucas111");
        reference.set(user);
        System.out.println(reference.get().getAge() + " " + reference.get().getName());

        User user2 = reference.getAndSet(user1);
        System.out.println(reference.get().getAge() + " " + reference.get().getName());
        System.out.println(user2.getAge()+" "+user2.getName());
    }

}


class User {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}