package com.dsa.array.kadaneAlgo;

public class MaxSubArraySum {
    public int maxSubArraySum(int [] arr)
    {
        int max = 0, curMax = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            curMax += arr[i];
            if(curMax > max)
                max = curMax;
            else if(curMax < 0)
                curMax =0;
        }
        return  max;
    }
}
