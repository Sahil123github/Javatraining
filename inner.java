package com.company;

public class inner {
    public static void main(String[] args)
    {
        Runnable r =()->{
        {
           // public void run() {

                for (int i = 0; i < 10; i++)
                {

                    System.out.println("child thred");

                  //  System.out.println("it is the inner class");
                }

            }
        };
           Thread t=new Thread(r);
           t.start();
           for (int i=0;i<10;i++)
           {
               System.out.println("it is the main thread");


    }



    }
}
