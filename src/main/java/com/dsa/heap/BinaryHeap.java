package com.dsa.heap;

import java.util.PriorityQueue;

public class BinaryHeap {
    private int size;
    private int capacity;
    private int [] arr;
    public void BinaryHeap(int capacity) {
        this.capacity = capacity;
        size = 0;
        arr = new int[capacity];
    }
    public int left(int i) {
        return 2*i +1;
    }
    public  int right(int i){
        return 2*i+2;
    }
    public int parent(int i){
        return (i-1)/2;
    }
    void swap(int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void insertElement(int x)
    {
        if(size == capacity)
            return;
        size++;
        arr[size-1] = x;
        for(int i = size - 1 ; i >= 0 && arr[parent(i)] > arr[i];)
        {
            swap(i, arr[parent(i)]);
            i = parent(i);
        }
    }

    public void minHeapify(int i)
    {
        int smallest = i;
        int lt = left(i), rt = right(i);
        if(lt < i && arr[lt] < arr[i])
            smallest = lt;
        if(rt < i && arr[rt] < arr[i])
            smallest = rt;
        if(smallest != i)
        {
            swap(smallest, i);
            minHeapify(smallest);
        }

    }
    public void maxHeapify(int i)
    {
        int largest = i;
        int lt = left(i), rt = right(i);
        if(lt > i && arr[lt] > arr[i])
            largest = lt;
        if(rt > i && arr[rt] > arr[i])
            largest = rt;
        if(largest != i)
        {
            swap(largest, i);
            maxHeapify(largest);
        }
    }
    public int extractMin()
    {
        if(size == 0)
            return Integer.MIN_VALUE;
        if(size == 1)
        {
            size --;
            return arr[size];
        }
        swap(0,size-1);
        size --;
        minHeapify(0);
        return arr[size+1];
    }
    public void buildMinHeap()
    {
        for(int i = (size-1)/2; i>=0; i++)
        {
            minHeapify(i);
        }
    }
    public void buildMaxHeap()
    {
        for(int i = (size-1)/2; i>=0; i++)
        {
            maxHeapify(i);
        }
    }
    public void decreaseKey(int i ,int x)
    {
        arr[i] = x;
        while(arr[parent(i)] > arr[i])
        {
            swap(i, parent(i));
            i = parent(i);
        }
    }
    public void deleteKey(int i)
    {
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }
    public void heapSort()
    {
        buildMaxHeap();
        for(int i = size-1; i>=0; i--)
        {
            swap(0,i);
            maxHeapify(i);
        }
    }
    public void sortKSortedArray(int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i <= k; i++)
            pq.add(arr[i]);

        int index = 0;
        for(int i = k + 1; i < size; i++){
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }
        while(!pq.isEmpty())
            arr[index++] = pq.poll();
    }
}
