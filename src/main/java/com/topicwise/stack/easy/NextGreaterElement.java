package com.topicwise.stack.easy;

import java.util.Stack;

public class NextGreaterElement {
    public int [] nextGreaterElement(int [] arr){
        Stack<Integer> stack = new Stack<>();
        int len = arr.length;

        int [] res = new int[len];
        res[len - 1] = -1;

        int ng = 0;
        stack.add(arr[len -1]);

        for(int i = len - 2; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            ng = stack.isEmpty() ? -1 : stack.peek();
            res[i] = ng;
            stack.add(arr[i]);
        }
        return res;
    }
    public static void main(String [] arr)
    {
        int [] array = {20, 30, 10, 5, 15};
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int [] res = nextGreaterElement.nextGreaterElement(array);

        for (int i = 0 ; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
