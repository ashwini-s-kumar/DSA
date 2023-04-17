package com.topicwise.queue.easy;

import com.topicwise.queue.PrintQueue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static Queue<Integer> reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        return queue;
    }

    public static void main(String [] arr){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        PrintQueue.print(queue);

        queue = reverse(queue);

        PrintQueue.print(queue);
    }
}
