package com.topicwise.array.easy;

import com.topicwise.math.Arithmetics;

public class MaxDifference {
    public int maxDiff(int [] arr)
    {
        int maxDiff = arr[1]-arr[0], min = arr[0];
         for(int i=1; i< arr.length; i++)
         {
             maxDiff = Arithmetics.max(maxDiff, arr[i] - min);
             min = Arithmetics.min(min, arr[i]);
         }
        return maxDiff;
    }

}
