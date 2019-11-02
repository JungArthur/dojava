package com.stream;

import java.util.Arrays;


public class Stream001 {

    public static void main(String[] args) {
        //컬렉션 객체를 연산해주는 편리한 stream 기능
        int[] arr = {1,2,3,4,5};

        int sumVal = Arrays.stream(arr).sum();
        int count = (int)Arrays.stream(arr).count();

        System.out.println(sumVal);
        System.out.println(count);
    }


}
