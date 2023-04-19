package com.topicwise.deque.easy;

import com.topicwise.array.PrintArray;

public class ArrayImplementation {
    static class MyDeque {
        int size, capacity;
        // rear is always equal to size - 1
        // front is always 0

        int[] arr;

        public MyDeque(int capacity) {
            this.capacity = capacity;
            size = 0;
            arr = new int[capacity];
        }

        // O(n)
        public void insertFront(int data) {
            if (isFull()) {
                System.out.println("Dequeue is full , cannot perform insertFront");
                return;
            }
            for (int i = size; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = data;
            size++;
            System.out.println("InsertFront : " + data);
        }


        //O(n)
        public void insertRear(int data) {
            if (isFull()) {
                System.out.println("Dequeue is full , cannot perform insertRear");
                return;
            }
            arr[size] = data;
            size++;
            System.out.println("InsertRear : " + data);
        }

        public int deleteFront() {
            if (size <= 0) {
                System.out.println("Dequeue is empty, Cannot perform deleteFront");
                return -1;
            }
            int data = arr[0];
            for (int i = 1; i <= size - 1; i++) {
                arr[i - 1] = arr[i];
            }
            size--;
            System.out.println("deletefront : " + data);
            return data;
        }

        public int deleteRear() {
            if (size <= 0) {
                System.out.println("Dequeue is empty, Cannot perform deleteRear");
                return -1;
            }
            int data = arr[size - 1];
            size--;
            System.out.println("deleteRear : " + data);
            return data;
        }

        public int getFront() {
            return 0;
        }

        public int getRear() {
            return size - 1;
        }

        public boolean isFull() {
            return size >= capacity;
        }

        public void display() {
            PrintArray.print(arr, size - 1);
        }
    }

    public static void main(String[] arr) {
        MyDeque dequeue = new MyDeque(3);

        dequeue.insertRear(10);
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
