package com.demo.w.comparator;

import java.util.*;

public class TestComparator {


    public static void main(String[] args) {
        List<Person> p = new ArrayList();
        Person p1 =new Person();
        p1.setAge(111);
        p1.setName("tracy");
        Person p2 =new Person();
        p2.setAge(11);
        p2.setName("tray");
        Person p3 =new Person();
        p3.setAge(1);
        p3.setName("tacy");
        p.add(p1);
        p.add(p2);
        p.add(p3);
        Collections.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                Person p1 = (Person) o1;
                Person p2 = (Person) o2;
                if (p1.getAge() > p2.getAge()) {
                    return 1;
                } else if (p1.getAge() < p2.getAge())
                    return -1;
                return 0;
            }
        });

        System.out.println(p);
    }

}
