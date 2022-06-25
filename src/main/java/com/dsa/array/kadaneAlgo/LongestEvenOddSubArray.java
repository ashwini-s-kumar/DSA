package com.dsa.array.kadaneAlgo;

import com.dsa.math.Arithmetics;

public class LongestEvenOddSubArray {
    public int longestEvenOddSubArray(int [] arr)
    {
        int curlength = 1, maxLength = 1;
        for(int i = 1 ; i < arr.length; i++)
        {
            if( (arr[i-1]%2 == 0 && arr[i]%2 != 0)
                    || (arr[i-1]%2 != 0 && arr[i]%2 == 0))
            {
                curlength++;
                maxLength = Arithmetics.max(curlength , maxLength);
            }
            else
                curlength = 1;
        }
        return maxLength;
    }
}
