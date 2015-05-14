package com;

/**
 * Created by 刘台振 on 14-12-3.
 */
class Resource implements Runnable{

    int num = 100;
    public void window(){
        while(true){
            if(num > 0){
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
                synchronized(Resource.class){
                    if(num<1){
                        break;
                    }
                    System.out.println(Thread.currentThread().getName()+"....票号..."+num--);
                }
            }else{
                break;
            }
        }
    }

    public void run(){
        window();
    }

}