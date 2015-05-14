package com.test;

/**
 * Created by 刘台振 on 15-3-19.
 */
public class test2 {
    public static void main(String []args){
    int a[]={1,55,2,53,345,99,100};
    sort(a);
    for(int j=0;j<=a.length;j++){
      System.out.println(a[j]);
    }


}
private static void sort(int[] a) {
  for(int i=1;i<a.length;i++){
    if(a[i-1]>a[i]){
      int temp=a[i];
      int j=i;
       while(j>0 && a[j-1]>temp){

         a[j]=a[j-1];
           j--;
       }
        a[j]=temp;
    }
  }

    }

}