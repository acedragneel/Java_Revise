package org.example;

public class Thread_2 implements Runnable{
    @Override
    public void run() {
        for( int i = 0; i < 5 ;i++)
            System.out.println("Runnable Thread " +Thread.currentThread() + " " + i);
    }
}
