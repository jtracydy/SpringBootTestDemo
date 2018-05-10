package com.demo.w.io;

import java.io.*;

/**
 * 字节流的读写
 * FileInputStream  FileOutputStream
 */
public class FileInputOutput {

    public static void main(String[] args) throws IOException {
        String path = "E:\\JVM.png";
        String pathTo = "E:\\JVM_copy_1.png";
//        fileStream(path, pathTo);
        bufferedStream(path, pathTo);
    }

    public static void fileStream(String path, String pathTo) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(path);             //写入流关联文件
            fos = new FileOutputStream(pathTo);            //读取流关联文件
            byte[] copy = new byte[1024];
            int len = 0;
            while ((len = fis.read(copy)) != -1) {
                fos.write(copy, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("复制文件异常");
        } finally {
            try {
                if (fis != null) fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("读取流");
            }
        }
    }

    public static void bufferedStream(String path, String pathTo) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        fis = new FileInputStream(path);
        fos = new FileOutputStream(pathTo);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int buf = 0;
        byte[] b = new  byte[1024];
        int num = 0;
        StringBuilder sb = new StringBuilder();
        while ((num = bis.read(b)) != -1) {
            sb.append(String.valueOf(b));
        }
        System.out.println(b);
    }

}
