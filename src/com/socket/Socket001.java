package com.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

//DNS서버에 Host name으로 Host address를 찾아오는 스테틱메서드
public class Socket001 {
    public static void main(String[] args) {
        InetAddress[] ia;
        try{
            ia = InetAddress.getAllByName("www.daum.net"); //스태틱 메서드로 www.daum.net에 대한 아이피 조사
            for(InetAddress a:ia){//배열이므로 for each 구문 사용
                System.out.print("Host name : " + a.getHostName());
                System.out.println(", IP address : " + a.getHostAddress());
            }
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}
