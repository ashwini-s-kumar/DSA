package com.topicwise.queue.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementingQueueUsingStack {
    static class MyQueue {

        private Stack<Integer> stack = new Stack<>();

        public void add(int x) {
            System.out.println("added : "+ x);
            stack.push(x);
        }

        public int poll() {
            if (stack.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int x = stack.pop();
            if (stack.isEmpty()) {
                return x;
            }
            int res = poll();
            stack.push(x);
            return res;
        }

        public int peek() {
            if (stack.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int x = stack.pop();
            if (stack.isEmpty()) {
                stack.push(x);
                return x;
            }
            int res = peek();
            stack.push(x);
            return res;
        }

    }

    public static void main(String [] arr){
        MyQueue queue = new MyQueue();

        queue.add(10);
        System.out.println(queue.peek());
        System.out.println(queue.poll());

        queue.add(20);
    }
}
