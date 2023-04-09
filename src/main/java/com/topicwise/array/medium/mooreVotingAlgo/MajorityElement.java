package com.topicwise.array.medium.mooreVotingAlgo;

public class MajorityElement {
    public int findCandidate( int [] arr)
    {
        int res = 0, count = 1;
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[res] == arr[i])
                count ++;
            else
                count --;
            if(count == 0)
            {
                count = 1;
                res = i;
            }
        }
        return  arr[res];
    }
    public void printMajority(int [] arr)
    {
        if(arr.length < 1)
            return;
        int cand = findCandidate(arr);
        int count = 0;
        for(int i = 0 ; i < arr.length; i++)
        {
            if(cand == arr[i])
                count++;
        }
        if(count > arr.length/2)
            System.out.print(" Majority element : " + cand);
        else
            System.out.print(" No Majority element");
    }
}
