package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 刘台振 on 15-5-4.
 */
public class Dynamin implements InvocationHandler {

    public Object userInterface;
    public Dynamin(Object userInterface){
     this.userInterface=userInterface;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       System.out.println("before");
        method.invoke(userInterface,args);
        System.out.println("after");
        return null;
    }
}
