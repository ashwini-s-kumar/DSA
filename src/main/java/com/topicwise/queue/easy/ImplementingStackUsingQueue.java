package com.topicwise.queue.easy;

import com.topicwise.queue.PrintQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementingStackUsingQueue {
    static class MyStack {

        private Queue<Integer> q = new LinkedList<>();

        public void push(int x) {
            int size = q.size();
            q.add(x);
            for (int i = 0; i < size; i++) {
                q.add(q.poll());
            }
            System.out.println("added : " + x);
        }

        public int pop() {
            System.out.println("removed : " + q.peek());
            return q.poll();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }

        public void display(){
            PrintQueue.print(q);
        }
    }

    public static void main(String[] arr) {
        MyStack stack = new MyStack();

        stack.push(20);
        stack.push(30);

        stack.display();

        stack.pop();
        stack.display();
    }
}
