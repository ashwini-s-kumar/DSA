package com.topicwise.stack.easy;

public class ArrayImplementation {
    int [] myStack;
    int capacity;
    int top; // size

    public ArrayImplementation(int capacity){
        this.capacity = capacity;
        myStack = new int[capacity];
        top = -1;
    }

    public void push(int val){
        if(top == capacity - 1){
            System.out.println("The stack is full");
            return;
        }
        top ++;
        myStack[top] =val;
        System.out.println("Successfully added element : "+ myStack[top]);
    }

    public void pop(){
        if(top == -1){
            System.out.println("The Stack is empty");
            return;
        }
        System.out.println("Successfully deleted element : " + myStack[top]);
        top--;
    }

    public void peek(){
        if(top == -1){
            System.out.println("The Stack is empty");
            return;
        }
        System.out.println("Peek element : " + myStack[top]);
    }

    public void isEmpty(){
        System.out.println("isEmpty : " + (top == -1)) ;
    }

    public void size(){
        System.out.println("Size : " + top);
    }

    public static void main(String [] ar){
        ArrayImplementation stack = new ArrayImplementation(3);
        stack.isEmpty();
        stack.size();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.size();
        stack.isEmpty();

        stack.pop();
        stack.peek();

        stack.push(40);
        stack.peek();
        stack.isEmpty();
        stack.size();
    }
}
