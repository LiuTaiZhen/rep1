package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 刘台振 on 15-3-26.
 */
public class test3 {
    public static void main(String[]args){
        int a[]={3,3,4,6,8,9,12,44,55};
        int b[]={55,66,3,6,7,8,9,11,12,13,14,44,3};
      //  sort(a, b);

   /**
    *  Map h=new HashMap();
        h.put(1,2);
        h.put(2,55);
        h.put(3,5222);
        h.remove(2);
        System.out.println(h);
    */
}
  public static  void MinHeapFixup(int a[], int i)
    {
        int j, temp;

        temp = a[i];
        j = (i - 1) / 2;      //父结点
        while (j >= 0 && i != 0)
        {
            if (a[j] <= temp)
                break;

            a[i] = a[j];     //把较大的子结点往下移动,替换它的子结点
            i = j;
            j = (i - 1) / 2;
        }
        a[i] = temp;
    }

    private static void sort(int[] a, int[] b) {
        Map m=new HashMap();
        Map mm=new HashMap();
        Map h=new HashMap();
        for(int i=0;i<a.length;i++){
            m.put(i,a[i]);
        }
        for(int j=0;j<b.length;j++){
            mm.put(j,b[j]);
        }
        if(m.size()>=mm.size()){
            for(int i=0;i<mm.size();i++){
                if(m.containsValue(mm.get(i))){
                    h.put(i,mm.get(i));

                }
            }
            contain(h);

        }else{
            for(int i=0;i<m.size();i++){
                if(mm.containsValue(m.get(i))){
                    h.put(i,m.get(i));
                }
            }
            contain(h);
        }
     }
      private static void contain(Map h) {

          for (int i=0; i < h.size(); i++)
          {
              Object temp = h.get(i);
              for (int j = i +1; j < h.size(); j++)
              {
                  if (temp == h.get(j)){
                      h.remove(j);
                      System.out.println(h);
              }

          }
    }


//         for(int i=0;i<h.size();i++){
//             System.out.println(h.get(i));
//         }
}
//    private static void contains(int a[]){
//        int c[];
//      for(int i=0;i<a.length;i++){
//       int temp=a[i];
//          for(int j=i+i;j<a.length;j++){
//              if(temp==a[j]){
//
//              }
//          }
//      }
//
//    }

}