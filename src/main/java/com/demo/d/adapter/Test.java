package com.demo.d.adapter;


public class Test {

    public static void main(String[] args) {
        Adapter adapter  = new Adapter();
        adapter.getCon("ps2");


        AdapterObject adapterObject = new AdapterObject(new Usb());
        adapterObject.conByPs2("adapterObject by ps2");



    }
}
