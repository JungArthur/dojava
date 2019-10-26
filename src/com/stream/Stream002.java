package com.stream;


import com.utils.Guest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream002 {

    public static void main(String[] args) {
        //컬렉션 객체를 연산해주는 편리한 stream 기능
        //ArrayList안에 객체를 확인해주는 편리한 기능 for문 사용을 최소화 해주는 효과가 있음
        List<Guest> sList = new ArrayList<>();
        sList.add(new Guest("id1","김길동","일반회원"));
        sList.add(new Guest("id2","이길동","일반회원"));
        sList.add(new Guest("id3","길동","일반회원"));
        sList.add(new Guest("id4","송길동","일반회원"));
        sList.add(new Guest("id5","홍길동","일반회원"));
        Stream<String> stream;
        System.out.println("===========필터==========");
        //이름이 3글자인 사람만 출력하게함
        sList.stream().filter(s -> s.getName().length() >= 3).forEach(s -> System.out.println(s.getName()));
        System.out.println("============맵=========");
        //모든 사람의 이름을 출력하게함
        sList.stream().map(s -> s.getName()).forEach(s -> System.out.println(s));
        System.out.println("===========정렬==========");
        //모든 사람의 이름을 정렬 후 출력하게함
        sList.stream().map(s -> s.getName()).sorted().forEach(s -> System.out.println(s));


        System.out.println("===========사용자정의==========");
        //reduce()를 사용해서 이름의 length가 가장 작은사람을 찾음 초기값과 컬렉션의 처음 값을 비교해서 반환, 그담값과 반환되값을 비교해서 반환...
        System.out.println(sList.stream().map(s -> s.getName()).reduce("        ", (s1, s2)->{
           if(s1.getBytes().length <= s2.getBytes().length)return s1;
           else return s2;
        }));



    }
}
