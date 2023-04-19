package com.topicwise.deque.easy;

import com.topicwise.array.PrintArray;

public class CircularArrayImplementation {
    static class MyDeque{
        static final int MAX = 100;
        int arr[];
        int front;
        int rear;
        int capacity;

        int size;

        public MyDeque(int capacity) {
            arr = new int[capacity];
            front = 0;
            rear = 0;
            size = 0;
            this.capacity = capacity;
        }


        // Checks whether Deque is full or not.
        boolean isFull() {
            return size >= capacity;
        }

        // Checks whether Deque is empty or not.
        boolean isEmpty() {
            return size <= 0;
        }

        // Inserts an element at front
        void insertFront(int key) {
            // check whether Deque if  full or not
            if (isFull()) {
                System.out.println("Overflow, cannot perform insertfront");
                return;
            }
            front = (front - 1 + capacity) % capacity;
            arr[front] = key;
            System.out.println("insertFront : "+ key);
            size++;
        }

        // function to inset element at rear end
        // of Deque.
        void insertRear(int key) {
            if (isFull()) {
                System.out.println(" Overflow , cannot perform insertrear");
                return;
            }
            int newRear = (front + size) % capacity;
            arr[newRear] = key;
            System.out.println("insertRear : "+ key);
            size++;
        }

        // Deletes element at front end of Deque
        void deleteFront() {
            // check whether Deque is empty or not
            if (isEmpty()) {
                System.out.println("Queue Underflow\n");
                return;
            }
            int data = arr[front];
            front = (front + 1) % capacity;
            System.out.println("deleteFront : "+ data);
            size --;
        }

        // Delete element at rear end of Deque
        void deleteRear() {
            if (isEmpty()) {
                System.out.println(" Underflow");
                return;
            }
            int data = arr[rear];
            System.out.println("deleteRear : " + data);
            size--;
        }

        // Returns front element of Deque
        int getFront() {
            // check whether Deque is empty or not
            if (isEmpty()) {
                System.out.println(" Underflow");
                return -1;
            }
            return front;
        }

        // function return rear element of Deque
        int getRear() {
            // check whether Deque is empty or not
            if (isEmpty() || rear < 0) {
                System.out.println(" Underflow\n");
                return -1;
            }
            return (front + size -1) % capacity;
        }

        void display(){
            System.out.println("==========================");
            System.out.println("Front : " + getFront() + " , rear : "+ getRear());
            PrintArray.print(arr);
        }
    }

        public static void main(String[] arr) {
        MyDeque dequeue = new MyDeque(3);

        dequeue.insertFront(10);
        dequeue.display();

        dequeue.insertFront(20);
        dequeue.display();

        dequeue.insertRear(30);
        dequeue.display();

        dequeue.insertFront(40);
        dequeue.display();

        dequeue.deleteFront();
        dequeue.display();

        dequeue.deleteRear();
        dequeue.display();

    }
}
