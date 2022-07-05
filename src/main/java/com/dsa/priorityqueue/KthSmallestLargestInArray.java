package com.dsa.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestLargestInArray {
    public void kthMin(int [] arr, int k)
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
        System.out.print("The " + k + "th smallest element is : " + pq.poll());
    }
    public void kthMax(int [] arr, int k)
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
        System.out.print("The " + k + "th largest element is : " + pq.poll());
    }
}
