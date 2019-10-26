package com.iostream;

import com.utils.StreamClass;

public class IOStream001 {

    public static void main(String[] args) {

        //싱글톤 생성
        StreamClass stream = StreamClass.getInstance();
        //console Read Line == Scanner Class readLine
        System.out.println("===========readLine==============");
        System.out.println(stream.consoleInputMethod());

        //console ReadOne and get One Char
        System.out.println("===========readOne==============");
        System.out.println(stream.systemInputTest1());

        //error..
        System.out.println("===========readWhile==============");
        System.out.println(stream.systemInputTest2());

        //input.txt file read ... one int \n one int \n
        System.out.println("===========fileWrite==============");
        stream.fileInputMethod1();

        //input.txt file read array
        System.out.println("===========fileWrite==============");
        stream.fileInputMethod1();

    }
}
