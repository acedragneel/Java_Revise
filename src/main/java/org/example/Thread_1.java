package org.example;

public class Thread_1 extends Thread{

    public Thread_1(String threadName) {
        super(threadName);
    }

    @Override
    public void run(){
        for( int i = 0; i < 5 ;i++)
            System.out.println("Instead Thread " +Thread.currentThread() + " " + i);
    }
}
