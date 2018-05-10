package com.demo.w.comparator;

public class User implements Comparable {

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

    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        if (user.getAge() > age)
            return -1;
        else if (user.getAge() < age)
            return 1;
        else
            return 0;
    }
}
