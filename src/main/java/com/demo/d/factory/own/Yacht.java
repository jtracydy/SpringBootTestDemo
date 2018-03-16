package com.demo.d.factory.own;

public class Yacht implements Boat{

    private String size;

    public Yacht(String size){
        this.size = size;
    }

    @Override
    public void size() {
        System.out.println(" i am Yacht, size = "+size);
    }
}
