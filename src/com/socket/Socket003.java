package com.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Socket003 {
    //Client
    public static void main(String[] args) {
        Socket socket = null;
        String line;
        InetAddress ia;
        try{
            ia = InetAddress.getByName("localhost");
            socket = new Socket(ia,4444);
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader in = new BufferedReader(isr);
            OutputStream os = socket.getOutputStream();
            PrintWriter out = new PrintWriter(os, true);
            while((line = in.readLine()) != null){
                if(line.equals("OUT")){
                    socket.shutdownInput();
                }
                System.out.println("Message from Server : " + line);
            }
            out.println("Hello, this is a client.");
            out.println("OUT");
            socket.shutdownOutput();
        }catch(UnknownHostException e1){
            e1.printStackTrace();
            System.exit(1);
        }catch (IOException e2){
            e2.printStackTrace();
            System.exit(1);
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
