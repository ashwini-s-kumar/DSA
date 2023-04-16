package com.topicwise.stack.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PreviousGreaterElement {
    void  printPreviousGreat(int [] arr)
    {
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);
        System.out.print(" -1 ");
        int pg;
        for( int i = 1; i < arr.length; i++)
        {
            while(!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();
            pg = stack.isEmpty() ? -1 : stack.peek();
            System.out.print(pg + " ");
            stack.add(arr[i]);
        }
    }

    public static void main(String [] arr)
    {
        int [] array = {20, 30, 10, 5, 15};
        PreviousGreaterElement previousGreaterElement = new PreviousGreaterElement();
        previousGreaterElement.printPreviousGreat(array);

    }
}
