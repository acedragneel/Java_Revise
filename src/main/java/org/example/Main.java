package org.example;

public class Main {
    public static void main(String[] args) {

//        var myNumber = 10;
//        System.out.println("Hello world!" + ((Object)myNumber).getClass().getName());

        System.out.println("main is starting");

//        Thread thread1 = new Thread_1("Thred1");
//        if it is a dameon thread it stops after the user thread
//        thread1.setDaemon(true);
//        thread1.start();


//        Thread thread2 = new Thread(new Thread_2(), "thread2");

//        Thread thread2 = new Thread(()->{
//            for( int i = 0; i < 5 ;i++)
//                System.out.println(Thread.currentThread() + ", " + i);
//        }, "thread2");
//        thread2.start();
//
//
//        System.out.println("main is existing");
//        System.out.println((Integer.MIN_VALUE));

//STACK
//        Stack stack = new Stack(5);
//
//        new Thread(()->{
//            int counter = 0;
//            while(++ counter < 10)
//                System.out.println("Pushed: " + stack.push(100));
//        }, "Pusher").start();
//
//        new Thread(()->{
//            int counter = 0;
//            while(++ counter < 10)
//                System.out.println("Popped: " + stack.pop());
//        }, "Popper").start();


//THREAD STATE
//        Thread thread3 = new Thread(()->{
//            try{
//                Thread.sleep(1);
//            for(int i =1000;i>0;i--);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//
//        }, "States");
//
//        thread3.start();
//
//        while (true){
//            Thread.State state = thread3.getState();
//            System.out.println(state);
//            if(state == Thread.State.TERMINATED) break;
//        }

//THREAD JOIN

//        Thread thread = new Thread(()->{
//            System.out.println(Thread.currentThread());
//        }, "Our Thread");
//
//        thread.start();
//
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        System.out.println("main is existing");
//
//        System.out.println(thread.getPriority());

//DEADLOCK

        String lock1 = "riddhi";
        String lock2 = "dutta";

        Thread thread1 = new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("lock acquired");
                }
            }
        }  , "thread1");

        Thread thread2 = new Thread(()->{
            synchronized (lock2){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("lock acquired");
                }
            }
        }  , "thread2");

        thread1.start(); thread2.start();




    }
}