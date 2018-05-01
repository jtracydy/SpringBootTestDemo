package com.demo.j.other;

public class PartionOnStack {

    static class User {
        private int id;
        private String name;

        public User() {
        }
    }

    /**
     * User的作用域是整个Main Class
     */
    private static User user;

    public static void foo() {
        user = new User();
        user.id = 1;
        user.name = "sixtrees";
    }

    public static void main(String[] args) {
        foo();
    }

}