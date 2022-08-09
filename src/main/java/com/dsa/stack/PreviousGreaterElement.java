package com.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreaterElement {
    void printPreviousGreat(int [] arr)
    {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(arr[0]);
        int pg = -1;
        System.out.print("The previous greater element :");
        for( int i = 0; i < arr.length; i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
                stack.pop();
            pg = stack.isEmpty() ? -1 : arr[stack.peek()];
            System.out.print(" " + pg);
            stack.add(i);
        }
    }
}
