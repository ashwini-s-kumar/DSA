package com.topicwise.heap.medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestLargestInArray {
    public static void kthMin(int [] arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//create max Heap
        for(int i = 0; i < k; i++)
        {
            pq.add(arr[i]);
        }
        for(int i = k ; i < arr.length; i++)
        {
            if(arr[i] < pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println("The " + k + "th smallest element is : " + pq.poll());
    }
    public static void kthMax(int [] arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();// creates minHeap
        for(int i = 0; i < k; i++)
        {
            pq.add(arr[i]);
        }
        for(int i = k ; i < arr.length; i++)
        {
            if(arr[i] > pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println("The " + k + "th largest element is : " + pq.poll());
    }

    public static void main(String [] arr){
        int [] a = {2, 10,13, 1, 22, 87, 67};
        kthMax(a, 2);
        kthMin(a, 3);
    }
}
