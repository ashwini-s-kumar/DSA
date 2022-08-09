package com.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
span :
 case 1 : if there is a greater element on the left
          span = then current index - index of closest greater element
 case 2 : no greater element on left
          span = current index + 1

 */
public class StockSpan {
    void printSpan(int [] arr)
    {
        Deque<Integer> stack = new ArrayDeque<>();
        System.out.print("The span = " + 1);
        stack.add(0);
        int span = 0;
        for( int i = 1; i < arr.length; i++)
        {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i])
                stack.pop();
            span = stack.isEmpty() ? i+1 : i - stack.peek();
            System.out.print(" " + span);
            stack.add(i);
        }
    }
}
