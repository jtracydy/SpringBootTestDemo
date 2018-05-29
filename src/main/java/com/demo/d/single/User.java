package com.demo.d.single;

public class User {

    private String name;
    private String age;

    private User() {

    }

    private static User user = new User();

    public  static User getInstance() {
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        User.user = user;
    }
}
