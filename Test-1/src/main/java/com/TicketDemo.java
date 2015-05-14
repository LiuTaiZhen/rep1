package com;

import java.math.BigDecimal;
import java.util.Stack;
/**
 * Created by 刘台振 on 14-12-3.
 */
public class TicketDemo {
    static Stack<Integer> resStack=new Stack<Integer>();
    public static void main(String[] args) {

    /*    for(int i=0;i<100;i++){
          resStack.add(i);
        }
      new SaleTask().start();
      new SaleTask().start();*/
        BigDecimal bigDecimal=new BigDecimal("0.001");

    }
    static class SaleTask extends Thread{
      public void run(){
        while( !resStack.isEmpty()){
         System.out.println("票号："+resStack.pop());
        }
          System.out.println("over");
      }
    }
}
