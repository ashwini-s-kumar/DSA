package com.topicwise.stack.easy;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImplementation {
    List<Integer> myStack ;

    public ArrayListImplementation(){
        myStack = new ArrayList<>();
    }

    public void push(int val){
        myStack.add(val);
        System.out.println("Successfully added element :" + val);
    }

    public void pop(){
        System.out.println("Successfully removed element : "+ myStack.get(myStack.size() -1 ));
        myStack.remove(myStack.size() -1);
    }

    public void peek(){
        System.out.println("Peek element is : "+ myStack.get(myStack.size() - 1));
    }
    public void isEmpty(){
        System.out.println("isEmpty : "+ (myStack.size() <= 0));
    }

    public void size(){
        System.out.println("Size : " + myStack.size());
    }

    public static void main(String [] arr){

        ArrayListImplementation stack = new ArrayListImplementation();

        stack.isEmpty();
        stack.size();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.size();

        stack.pop();
        stack.peek();

        stack.isEmpty();
        stack.size();

        stack.push(40);
        stack.size();
    }
}
