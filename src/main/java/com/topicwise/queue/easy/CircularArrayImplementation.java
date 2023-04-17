package com.topicwise.queue.easy;

import java.util.ArrayList;

public class CircularArrayImplementation {
    // Java program for insertion and
// deletion in Circular Queue

    static class MyQueue {

        // Declaring the class variables.
        private int capacity, front, rear;

        // Declaring array list of integer type.
        private int[] queue;

        // Constructor
        MyQueue(int capacity) {
            this.capacity = capacity;
            this.front = this.rear = -1;
            queue = new int[capacity];
        }

        // Method to insert a new element in the queue.
        public void enQueue(int data) {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                queue[rear] = data;
            } else if ((rear + 1) % capacity == front) {
                System.out.println("Queue is full");
            } else {
                rear = (rear + 1) % capacity;
                queue[rear] = data;
            }
        }

        // Function to dequeue an element
// form th queue.
        public int deQueue() {
            if(front == -1 && rear == -1){
                System.out.println("Queue is empty");
                return -1;
            }
            int data = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }else{
                front = (front+ 1 ) % capacity;
            }
            return data;
        }

        // Method to display the elements of queue
        public void displayQueue() {
            if(front == -1 && rear == -1){
                System.out.println("Queue is empty");
                return ;
            }
            System.out.println("The elements in queue are :");
            int i = front;
            while(i <= rear){
                System.out.print(queue[i] + " ");
                i = (i+1) % capacity;
            }
        }

        // Driver code
        public static void main(String[] args) {

            // Initialising new object of
            // CircularQueue class.
            MyQueue q = new MyQueue(5);

            q.enQueue(14);
            q.enQueue(22);
            q.enQueue(13);
            q.enQueue(-6);

            q.displayQueue();

            int x = q.deQueue();

            // Checking for empty queue.
            if (x != -1) {
                System.out.print("Deleted value = ");
                System.out.println(x);
            }

            x = q.deQueue();

            // Checking for empty queue.
            if (x != -1) {
                System.out.print("Deleted value = ");
                System.out.println(x);
            }

            q.displayQueue();

            q.enQueue(9);
            q.enQueue(20);
            q.enQueue(5);

            q.displayQueue();

            q.enQueue(20);
        }
    }

// This code is contributed by Amit Mangal.

}
