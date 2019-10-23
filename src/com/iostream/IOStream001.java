package com.iostream;

import com.utils.StreamClass;

public class IOStream001 {

    public static void main(String[] args) {

        //싱글톤 생성
        StreamClass stream = StreamClass.getInstance();
        stream.fileInputMethod();
        System.out.println("===========readLine==============");
        System.out.println(stream.consoleInputMethod());

        System.out.println("===========readOne==============");
        System.out.println(stream.systemInputTest1());

        System.out.println("===========readWhile==============");
        System.out.println(stream.systemInputTest2());
    }
}
