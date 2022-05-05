package com.company;

public class thread extends Thread {
    public void run(){

        for (int i=1;i<5;i++){
            try {
                thread sleep(1000);
                System.out.println(i);
            } catch (Exception e) {

            }
        }
        System.out.println("child thread");
        System.out.println(thread.currentThread().getName());
      //  if (int=0;i<10;i++)

    }

    public static void main(String[] args) throws InterruptedException {
        thread t =new thread();
        thread.sleep(1000);
        t.setDaemon(true);
        t.setPriority(5);

        System.out.println(thread.currentThread().isAlive());
        System.out.println(t.isAlive());
        t.start();
        System.out.println(thread.currentThread().getName());
      //  System.out.println(thread.currentThread().setName());
    }
}
