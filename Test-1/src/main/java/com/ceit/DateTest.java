package com.ceit;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by 刘台振 on 14-12-8.
 */
public class DateTest {
    public static void main(String[]args){
       Calendar calendar=Calendar.getInstance();
       calendar.set(1999,2,3);
       calendar.add(Calendar.DAY_OF_WEEK,4);
       int t=calendar.get(Calendar.DAY_OF_WEEK)-1;
       System.out.println(t);

    }
    public static List findDateStartOrEndWeek(){
      List<String> list=new ArrayList<String>();
        SimpleDateFormat sdf=new SimpleDateFormat("MM.dd");
        Calendar calendar=Calendar.getInstance();
        Calendar cal=Calendar.getInstance();
        int day_of_week=calendar.get(Calendar.DAY_OF_WEEK)-1;
        if(day_of_week==0){
           day_of_week=7;

        }
        calendar.add(Calendar.DATE, -day_of_week + 1);
        cal.add(Calendar.DATE, -day_of_week + 7);
        list.add(sdf.format(calendar.getTime())+"-"+sdf.format(cal.getTime()));
        for(int i=0;i<4;i++){
            calendar.add(Calendar.DATE, -7);
            cal.add(Calendar.DATE, -7);
            list.add(sdf.format(calendar.getTime())+"~"+sdf.format(cal.getTime()));
        }
        Collections.reverse(list);
        return list;
    }
}
