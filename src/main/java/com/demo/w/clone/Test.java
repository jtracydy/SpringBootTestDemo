package com.demo.w.clone;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person(23, "zhang");
        Person p1 = (Person)  p.clone();

        System.out.println("p.getName().hashCode() : " + p.getName().hashCode());
        System.out.println("p1.getName().hashCode() : " + p1.getName().hashCode());

        String result = p.getName().hashCode() == p1.getName().hashCode()
                ? "clone是浅拷贝的" : "clone是深拷贝的";

        System.out.println(result);

    }
}
