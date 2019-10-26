package com.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket002 {
    //Socket Server programming
    public static void main(String[] args) {
        ServerSocket ssocket = null;
        try {
            String line;
            ssocket = new ServerSocket(4444);  //localhost의 4444포트에 서버 객체를 생성한다.
            System.out.println("Server is waiting ... ");
            while(true){
                Socket socket = ssocket.accept();
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader in = new BufferedReader(isr);
                OutputStream os = socket.getOutputStream();
                PrintWriter out = new PrintWriter(os, true);
                out.println("Hello, this is a server");
                out.println("OUT");
                while((line = in.readLine()) != null){
                    System.out.println("Message from client : " + line);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }finally {
            if(ssocket != null) {
                try {
                    ssocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
