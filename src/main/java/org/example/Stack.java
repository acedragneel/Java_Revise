package org.example;

public class Stack {
    private int[] array;
    private int stackTop;
    Object lock;

    public Stack(int capacity){
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    //when you want to synchronized the whole class
    public synchronized boolean push(int element){
            if(isFull()) return false;
            ++ stackTop;

            try{Thread.sleep(1000);} catch(Exception e){ }

            array[stackTop] = element;
            return true;
    }

    // when you want only synchronized particular block of code.
    public int pop(){
        synchronized (lock){
            if(isEmpty()) return Integer.MIN_VALUE;
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;

            try{Thread.sleep(1000);} catch(Exception e){ }

            stackTop --;
            return obj;
        }

    }
    public boolean isEmpty(){
        return stackTop > 0;
    }


    public boolean isFull(){
        return stackTop >= array.length -1;
    }

}
