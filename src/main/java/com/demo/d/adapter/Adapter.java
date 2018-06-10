package com.demo.d.adapter;


/**
 * 适配器类，ps2接口想连接到电脑上，电脑上usb接口
 */
public class Adapter extends Usb implements Ps2  {

    @Override
    public void conByPs2(String way) {
        getCon(way);
    }

}
