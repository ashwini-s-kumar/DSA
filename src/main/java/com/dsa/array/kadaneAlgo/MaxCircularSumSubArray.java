package com.dsa.array.kadaneAlgo;

import com.dsa.math.Arithmetics;

public class MaxCircularSumSubArray {
    public int maxCircularSumSubArray(int [] arr)
    {
        if(arr.length < 1)
            return 0;
        MaxSubArraySum maxSubArraySum = new MaxSubArraySum();
        int maxNormalArray = maxSubArraySum.maxSubArraySum(arr);
        int sum =0;
        for(int i = 0; i<arr.length; i++)
        {
            sum += arr[i];
            arr[i] = arr[i] * -1;
        }
        int maxCircularArray = maxSubArraySum.maxSubArraySum(arr);
        if(maxCircularArray + sum == 0)
            return maxNormalArray;
        else
            return Arithmetics.max(maxNormalArray, maxCircularArray + sum);
    }
}
