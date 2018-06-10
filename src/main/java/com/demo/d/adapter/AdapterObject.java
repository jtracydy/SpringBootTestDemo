package com.demo.d.adapter;

public class AdapterObject implements Ps2 {


    private Usb usb ;

    public AdapterObject(Usb usb ){
        this.usb = usb;
    }

    @Override
    public void conByPs2(String way) {
        usb.getCon(way);
    }
}
