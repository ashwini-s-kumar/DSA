package com.dsa.array;

import com.dsa.math.Arithmetics;

public class MaxDifference {
    public int maxDiff(int [] arr)
    {
        Arithmetics arithmetics = new Arithmetics();
        int maxDiff = arr[1]-arr[0], min = arr[0];
         for(int i=1; i< arr.length; i++)
         {
             maxDiff = arithmetics.max(maxDiff, arr[i] - min);
             min = arithmetics.min(min, arr[i]);
         }
        return maxDiff;
    }

}
