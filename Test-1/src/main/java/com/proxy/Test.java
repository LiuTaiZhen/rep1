package com.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by 刘台振 on 15-5-4.
 */
public class Test {
    public static void main(String[]args) throws IOException {
//        userInterface user=new User();
//        InvocationHandler handler=new Dynamin(user);
//
//        userInterface us= (userInterface) Proxy.newProxyInstance(handler.getClass().getClassLoader(), user.getClass().getInterfaces(), handler);
//        System.out.println(us.getClass().getName());
//        us.getUserName();
//        us.hh();
        String name="13968623794";
        String username="太真";
        System.out.println(StringUtil.getRandom());
    //    System.out.println(StringUtil.getPingYin(username));
   //    System.out.println(  StringUtil.isMobile(name));

        String cmd="cmd.exe ping";
        String ipprefix="192.168.10.";
        int begin =101;
        int end =200;
        Process p=null;
        for(int i=begin;i<end;i++){
            p=Runtime.getRuntime().exec(cmd+i);
            String line=null;
            BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream()));
            while((line = reader.readLine()) != null)
            {

            }
            reader.close();
            p.destroy();
        }

    }
}
