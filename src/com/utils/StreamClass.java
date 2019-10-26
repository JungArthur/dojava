package com.utils;

import java.io.*;

public class StreamClass {

    //싱글톤용 인스턴스 참조변수
    private static StreamClass streamClass = null;
    private static BufferedReader br = null;

    //생성자
    private StreamClass(){};

    public static StreamClass getInstance(){
        if(streamClass == null){
            streamClass = new StreamClass();
            InputStream in = System.in;
            InputStreamReader reader = new InputStreamReader(in);
            br = new BufferedReader(reader);

        }
        return streamClass;
    }

    public void fileInputMethod1(){
        int i = -1;
        try(FileInputStream fis = new FileInputStream("input.txt");){
            while((i=fis.read()) != -1){
                System.out.println((char)i);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String consoleInputMethod(){
        String a = null;
        try {
            a = br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return a;
    }

    public int systemInputTest1(){
        int i = -1;
        try {
            i = System.in.read();
        }catch(IOException e) {
            e.printStackTrace();
        }
        return i;
    }

    public int systemInputTest2(){
        int i = -1;
        try {
            while((i = System.in.read()) != 10);
        }catch(IOException e) {
            e.printStackTrace();
        }
        return i;
    }




}
