package com.demo.w.io_b;


import java.io.OutputStream;
import java.net.Socket;

public class Send {


    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("127.0.0.1",8007);
        OutputStream out = socket.getOutputStream();
        String message="你好  yiwangzhibujian";
        out.write(message.getBytes("UTF-8"));
        out.close();
        socket.close();
    }
}
