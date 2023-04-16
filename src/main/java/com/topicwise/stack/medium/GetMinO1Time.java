package com.topicwise.stack.medium;

import java.util.ArrayList;
import java.util.List;

public class GetMinO1Time {
    static class MyStack {
        List<Integer> mainStack ;
        List<Integer> auxiliaryStack ;

        public MyStack(){
            mainStack = new ArrayList<>();
            auxiliaryStack = new ArrayList<>();
        }

        public void push(int val){
            mainStack.add(val);

            if(auxiliaryStack.size() >= 1) {
                if (val <= peek(auxiliaryStack)) {
                    auxiliaryStack.add(val);
                }
            }else{
                // 1st push element
                auxiliaryStack.add(val);
            }
        }

        public int pop(){
            int topElement = mainStack.get(mainStack.size() - 1);
            mainStack.remove(mainStack.size() - 1);

            if(topElement == peek(auxiliaryStack)){
                auxiliaryStack.remove(auxiliaryStack.size() - 1);
            }

            return topElement;
        }

        public int size(){
            return mainStack.size();
        }

        public int peek(List<Integer> stack){
            return stack.get(stack.size() - 1);
        }

        public void getMin(){
            System.out.println("Min: " +auxiliaryStack.get(auxiliaryStack.size() -1));
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
