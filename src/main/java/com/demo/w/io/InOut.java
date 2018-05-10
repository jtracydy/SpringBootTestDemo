package com.demo.w.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 从键盘的写入和输出
 * <p>
 * System.in  标准输入
 * System.out 标准输出
 */
public class InOut {

    public static void main(String[] args) throws Exception {
        inOut();
    }

    public static void inOut() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = br.readLine()) != null) {
            if(line.equals("over"))
            sb.append(line);
        }
        System.out.println(sb);
        br.close();
    }
}
