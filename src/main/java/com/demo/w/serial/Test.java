package com.demo.w.serial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception{

        String path = "e:\\1.txt";
        FileOutputStream fw = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fw);
        Person person  = new Person();
        person.setAge(123);
        person.setGender(Gender.MALE);
        person.setName("lucas");

        Man man = new Man();
        man.setName("mantracy");
        person.setMan(man);

        Women women1 = new Women();
        women1.setName("womenLucas1");
        person.setWomen(women1);

        Women women2 = new Women();
        women2.setName("womenLucas2");
        Women women3 = new Women();
        women3.setName("womenLucas3");
        List<Women> list = new ArrayList<>();
        list.add(women1);
        list.add(women2);
        list.add(women3);
        person.setList(list);

        oos.writeObject(person);
        oos.close();

        FileInputStream fs = new FileInputStream(path);
        ObjectInputStream ios = new ObjectInputStream(fs);
        Person p = (Person)ios.readObject();
        ios.close();
        System.out.println(p.getAge()+" "+p.getGender()+" "+p.getName());
//        System.out.println(p.getWomen().getName());
        System.out.println(p.getMan().getName());
        System.out.println(p.getList().get(0).getName());
    }
}
