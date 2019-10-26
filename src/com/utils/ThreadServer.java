package com.utils;

import java.io.*;
import java.net.Socket;

public class ThreadServer extends Thread{

    private Socket socket;

    //생성자
    public ThreadServer(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        String line;
        try {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader in = new BufferedReader(isr);
            OutputStream os = socket.getOutputStream();
            PrintWriter out = new PrintWriter(os, true);
            out.println("Hello, this is a server");
            out.println("OUT");
            while ((line = in.readLine()) != null) {
                System.out.println("Message from client : " + line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
