package com.socket;

import com.utils.ThreadServer;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket004{
    //thread server
    public static void main(String[] args) {
        InetAddress ia;
        try{
            ia = InetAddress.getByName("localhost");
            ServerSocket ssocket = new ServerSocket(4444);
            System.out.println("Server is waiting");
            while(true){
                Socket sk = ssocket.accept();
                ThreadServer service = new ThreadServer(sk);
                service.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
