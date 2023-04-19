package com.topicwise.deque.medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// perform enqueue, dequeue, getMin, getMax in O(1).
public class SpecialQueue {

    // normal queue
    private Queue<Integer> queue = new LinkedList<>();

    // Doubly ended queue
    private Deque<Integer> minQueue = new ArrayDeque<>();

    // Double ended queue
    private Deque<Integer> maxQueue = new ArrayDeque<>();

    public void enqueue(int data){
        queue.add(data);
        while(!minQueue.isEmpty() && minQueue.peekLast() > data){
            minQueue.removeLast();
        }
        minQueue.offerLast(data);

        while(!maxQueue.isEmpty() && maxQueue.peekLast() < data){
            maxQueue.removeLast();
        }
        maxQueue.offerLast(data);
        System.out.println("Added :" + data);
    }

    public int dequeue(){
        int data = queue.poll();
        if(minQueue.peekFirst() == data){
            minQueue.removeFirst();
        }
        if(maxQueue.peekFirst() == data){
            maxQueue.removeFirst();
        }
        System.out.println("Removed : " + data);
        return data;
    }

    public int getMin(){
        if(minQueue.isEmpty()){
            return -1;
        }
        System.out.println("min : "+ minQueue.peekFirst());
        return minQueue.peekFirst();
    }

    public int getMax(){
        if(maxQueue.isEmpty()){
            return -1;
        }
        System.out.println("max : " + maxQueue.peekFirst());
        return maxQueue.peekFirst();
    }

    public static void main(String [] arr){
        SpecialQueue queue = new SpecialQueue();

        queue.enqueue(3);
        queue.enqueue(2);

        queue.getMax();
        queue.getMin();

        queue.enqueue(1);
        queue.getMin();
        queue.getMax();

        queue.dequeue();
        queue.getMin();
        queue.getMax();

        queue.enqueue(100);
        queue.getMin();
        queue.getMax();
    }
}
