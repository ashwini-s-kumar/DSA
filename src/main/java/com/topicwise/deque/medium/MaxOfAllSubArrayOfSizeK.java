package com.topicwise.deque.medium;

import com.topicwise.stack.easy.ArrayImplementation;

import java.util.ArrayDeque;

public class MaxOfAllSubArrayOfSizeK {

    public static void maxInAllSubArray(int [] arr, int k){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i = 0 ; i < k; i++){

            while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]){
                deque.removeLast();
            }

            deque.offerLast(i);
        }

        for(int i = k; i < arr.length ; i++){
            System.out.print(arr[deque.peekFirst()] + " ");

            while(!deque.isEmpty() && deque.peekFirst() <= i - k){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.offerLast(i);
        }

        while(!deque.isEmpty()){
            System.out.print(arr[deque.removeFirst()] + " ");
        }
    }

    public static void main(String [] arr){
        int [] array = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        maxInAllSubArray(array, k);
    }
}
