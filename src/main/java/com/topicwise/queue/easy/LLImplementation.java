package com.topicwise.queue.easy;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class LLImplementation {
    static class MyQueue {
        Node rear;

        Node front;

        public void enQueue(int data) {
            Node temp = new Node(data);
            if (front == null) {
                front = rear = temp;
            } else {
                rear.next = temp;
                rear = temp;
            }
            System.out.println("added element : " + data);
        }

        public int deQueue() {
            int data = -1;
            if(front == null){
                System.out.println("Queue is empty, Not able to dequeue");
            }else{
                data = front.data;
                front = front.next;
            }
            if(data != -1) {
                System.out.println("removed element : " + data);
            }
            return data;
        }

        public void display() {
            System.out.print("The queue elements are : ");
            if(front == null){
                System.out.print("Queue is empty");
            }else {
                PrintLinkedList.print(front);
            }
            System.out.println(" ");
        }
    }
    public static void main(String [] arr){
        MyQueue queue = new MyQueue();
        queue.display();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.display();

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.display();
        queue.enQueue(30);
        queue.display();

    }
}
