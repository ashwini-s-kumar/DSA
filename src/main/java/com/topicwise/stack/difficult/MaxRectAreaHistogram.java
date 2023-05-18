package com.topicwise.stack.difficult;

import java.util.Stack;

public class MaxRectAreaHistogram {

    // arar = topElement * (index of next small ele - index of prev small element  - 1 )
    // or
    // area = topElement * (index of next small ele)
    public int maxArea(int [] arr){
        int area = 0, maxArea = 0;
        Stack<Integer> stack = new Stack<>();// store index of max ele in  array

        for(int i = 0; i < arr.length; i++){

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                int topElement = stack.pop();
                // i =  (index of next small ele)
                // stack.peek() = index of prev small element
                area = arr[topElement] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            int topElement = stack.pop();
            area = arr[topElement] * (stack.isEmpty() ? arr.length : arr.length - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }
        System.out.println("The max area of Rectangular histogram : " + maxArea);
        return maxArea;
    }

    public static void main(String [] arr){
        int [] array = {6,2,5,4,1,5,6};
        MaxRectAreaHistogram histogram = new MaxRectAreaHistogram();
        histogram.maxArea(array);
    }
}
