package com.socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.LinkedList;

/**
 * Created by 刘台振 on 14-12-8.
 */
public class Client {
    public static void main(String[]args){
      String host="127.0.0.1";
      int port=10002;
        try {
            Socket client=new Socket(host,port);
            Writer writer=new OutputStreamWriter(client.getOutputStream());
            writer.write("hello jay zhou");
            writer.flush();
            writer.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
