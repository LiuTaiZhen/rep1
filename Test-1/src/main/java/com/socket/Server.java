package com.socket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 刘台振 on 14-12-8.
 */
public class Server {
    public static void main(String []args){
    int port=10002;
        ServerSocket serverSocket;
        try {
            serverSocket=new ServerSocket(port);
            Socket socket=serverSocket.accept();
            Reader reader=new InputStreamReader(socket.getInputStream());
            char chars[]=new char[64];
            int len;
            StringBuffer stringBuffer=new StringBuffer();
            while((len=reader.read(chars))!=-1){
                stringBuffer.append(new String(chars,0,len));
            }
            System.out.println("from"+stringBuffer);
            reader.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}
