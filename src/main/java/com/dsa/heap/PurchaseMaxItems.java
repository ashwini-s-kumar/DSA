package com.dsa.heap;

import java.util.PriorityQueue;

public class PurchaseMaxItems {
    public int purchase(int [] arr, int budget)
    {
        int items = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++)
        {
            pq.add(arr[i]);
        }
        while(!pq.isEmpty() && budget >= pq.peek())
        {
            budget = budget - pq.poll();
            items++;
        }
        return items;
    }
}
