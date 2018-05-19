package com.demo.w.io_b;


import java.net.ServerSocket;

public class Send {


    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(8007);
        socket.accept();

    }
}
