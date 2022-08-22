package com.dsa.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStream {
    /*5
            10
            10
            12.5
            10*/
    public void median(int [] arr)
    {
        //max heap
        PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder());
        //min heap
        PriorityQueue<Integer> greater = new PriorityQueue<>();
        //median
        double med = arr[0];
        smaller.add(arr[0]);
        System.out.print("The median of the stream : "+ med + " ");
        for( int i = 1 ; i < arr.length; i++){
            int x = arr[i];
            if(smaller.size() > greater.size()){
                if(x < med)
                {
                    greater.add(smaller.remove());
                    smaller.add(x);
                }
                else
                    greater.add(x);
                med = (smaller.peek() + greater.peek()) / 2;
            }
            else if(smaller.size() == greater.size()) {
                if(x < med) {
                    smaller.add(x);
                    med = smaller.peek() ;
                }
                else{
                    greater.add(x);
                    med = greater.peek() ;
                }

            }else if(smaller.size() < greater.size()) {
                if(x > med)
                {
                    smaller.add(greater.remove());
                    greater.add(x);
                }
                else
                    smaller.add(x);
                med = (smaller.peek() + greater.peek()) / 2;
            }
            System.out.print(med +" ");
        }

    }
}
