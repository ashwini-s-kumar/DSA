package com.topicwise.heap.difficult;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArray {
    class Triplet implements Comparable<Triplet>{
        int value;
        int arrPos;
        int valPos;
        Triplet(int value, int arrayPos, int valuePos)
        {
            this.value = value;
            this.arrPos = arrayPos;
            this.valPos = valuePos;
        }
        public int compareTo(Triplet t)
        {
            if(value <= t.value)
                return -1;
            else
                return 1;
        }
    }
    public List<Integer> mergeArray(ArrayList<ArrayList<Integer>> arr)
    {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.size(); i++)
        {
            pq.add(new Triplet(arr.get(i).get(0), i, 0));
        }
        while(!pq.isEmpty())
        {
            Triplet cur = pq.poll();
            int val = cur.value;
            res.add(val);
            int arrPos = cur.arrPos;
            int valPos = cur.valPos;;
            if(valPos+1 < arr.get(arrPos).size())
            {
                valPos +=1;
                pq.add(new Triplet(arr.get(arrPos).get(valPos),arrPos,valPos));
            }
        }
        return res;
    }

}
