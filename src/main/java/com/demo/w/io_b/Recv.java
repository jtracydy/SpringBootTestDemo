package com.demo.w.io_b;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Recv {


    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8007);
        //server将一直等待连接的到来
        System.out.println("server将一直等待连接的到来");
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[2014];
        StringBuilder sb = new StringBuilder();
        int len = 0;
        while ((len = in.read(bytes)) != -1) {
            //sb.append(String.valueOf(bytes));
            //System.out.println(String.valueOf(bytes));
            sb.append(new String(bytes, 0, len, "UTF-8"));
        }
        System.out.println("get message from client: " + sb);
        in.close();
        socket.close();
        server.close();
    }
}
