package com.topicwise.array.kadaneAlgo;

public class MaxSubArraySum {
    public int maxSubArraySum(int [] arr)
    {
        int max = Integer.MIN_VALUE;// very imp
        int curMax = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            curMax += arr[i];
            if(curMax > max)
                max = curMax;
            if(curMax < 0)
                curMax =0;
        }
        return  max;
    }
}