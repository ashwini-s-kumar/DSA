package com.topicwise.stack.medium;

import java.util.ArrayList;
import java.util.List;

public class GetMinO1TimeO1Space {
    static class MyStack {
        List<Integer> mainStack ;
        //List<Integer> auxiliaryStack ;
        int min;

        public MyStack(){
            mainStack = new ArrayList<>();
            min = Integer.MAX_VALUE;
        }

        public void push(int val){
            if(min > val) {
                mainStack.add(val - min);
                min = val;
            }else{
                mainStack.add(val);
            }
            System.out.println("Successfully pushed : "+ val);
        }

        public int pop(){
            int topElement = mainStack.get(mainStack.size() - 1);
            if (topElement < 0) {
                min = min - topElement;
            }
            mainStack.remove(mainStack.size() -1);
            System.out.println("Successfully pop : "+ topElement);
            return topElement;
        }

        public int size(){
            return mainStack.size();
        }

        public int peek(List<Integer> stack){
            return stack.get(stack.size() - 1);
        }

        public void getMin(){
            System.out.println("Min: " + min);
        }
    }

    public static void main(String [] arr){
        MyStack stack = new MyStack();
        stack.push(7);
        stack.push(3);

        stack.getMin();
        stack.push(2);

        stack.getMin();

        stack.pop();
        stack.push(1);
        stack.getMin();
    }
}
