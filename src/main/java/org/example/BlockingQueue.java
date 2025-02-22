package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

    private Queue<Integer> q;

    private int capacity;

    public BlockingQueue(int cap){
        q = new LinkedList<>();
        capacity = cap;
    }

    public boolean add(int item){
        synchronized (q){
            while(q.size() == capacity) { // instead of if we use while if we have two threads waiting
                try {
                    q.wait(); //adder 1 and adder 2
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            q.add(item);
            q.notifyAll();
            return true;
        }
    }

    public int remove(){
        synchronized (q){
            while(q.size() == 0)
            {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            int element = q.poll();
            q.notifyAll();
            return element;
        }
    }
}
