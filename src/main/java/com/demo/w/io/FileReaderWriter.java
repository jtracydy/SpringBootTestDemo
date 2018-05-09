package com.demo.w.io;

import java.io.*;

/**
 * 字符流主要用于对文件的写入和输出
 * 其父类是Reader 和 Writer
 */
public class FileReaderWriter {

    public static void main(String[] args) throws IOException {
        String path ="E:\\1.txt";
        //writer(path);
        //reader(path);
        readerBuffer(path);
//        writerExists(path);
//        writeBuffer(path);
    }

    public static void writer( String path) throws IOException{
        FileWriter fw = new FileWriter(path);
        fw.write("file write");
        fw.flush();
        fw.write("write end");
        fw.close();
    }

    public static void writerExists(String path) throws IOException {
        FileWriter fw = new FileWriter(path, true);
        fw.write(" is charactor table?");
        fw.close();
    }
    public static void reader(String path)throws IOException{
        FileReader fr = new FileReader(path);
        char[] c= new char[5];
        StringBuilder str = new StringBuilder();
        int num = 1;
        while ((num = fr.read(c))!=-1) {
            str.append(String.valueOf(c));
        }
        System.out.println(str);
    }

    /**
     * 缓冲区readerBuffer
     * @param path
     * @throws IOException
     */
    public static void readerBuffer(String path)throws IOException{
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        String s = "";
        while( (s = br.readLine() )!= null){
            sb.append(s);
        }
        System.out.println(sb);
    }

    public static void writeBuffer(String path) throws IOException {

        FileWriter fw = new FileWriter(path);

        BufferedWriter bw = new BufferedWriter(fw);
        for (int x = 1; x < 5; x++) {
            bw.write("abc");
            bw.newLine();                  //java提供了一个跨平台的换行符newLine();
            bw.flush();
        }

        bw.flush();                                                //刷新缓冲区
        bw.close();

        fw.close();
    }
}
