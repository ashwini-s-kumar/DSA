package com.topicwise.stack.easy;

import com.topicwise.linkedlist.Node;

public class SingleLLImplementation {
    Node head;
    int size;

    public SingleLLImplementation(){
        head = null;
        size = 0;
    }

    public void push(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size ++;
        System.out.println("Successfully added element : "+ head.data);
    }

    public void pop(){
        if(size <= 0){
            System.out.println("Stack is empty");
        }
        System.out.println("Successfully deleted element : " + head.data);
        head = head.next;
        size --;
    }

    public void peek(){
        if(size <= 0){
            System.out.println("Stack is empty");
        }
        System.out.println("Peek element : " + head.data);
    }

    public void isEmpty(){
        System.out.println("isEmpty : " + (size <= 0));
    }

    public void size(){
        System.out.println("Size : " + size);
    }

    public static void main(String [] arr){

        SingleLLImplementation stack = new SingleLLImplementation();

        stack.isEmpty();
        stack.size();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.size();
        stack.isEmpty();

        stack.peek();
        stack.pop();
        stack.peek();

        stack.size();
    }
}
