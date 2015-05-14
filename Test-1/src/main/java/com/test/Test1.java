package com.test;

/**
 * Created by 刘台振 on 15-3-19.
 */
public class Test1  {

    public  static void main(String[]args){
      String a="lhahajffj23ss";

      sort(a);

    }
    private static void sort(String s ) {
        if(s.isEmpty()){
            return ;
        }else{
         for(int i=0;i<=s.length();i++){
             for(int j=i+1;j<s.length()-1;j++){
             if(s.charAt(i)==s.charAt(j+i)){
                 System.out.println(s.charAt(i));
            }
        }
         }

  }
    }

}