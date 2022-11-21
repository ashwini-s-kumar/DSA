package com.topicwise.array;

public class MissingNumber {
    public int missingNumber(int [] arr)
    {
        int n = arr.length;
        int actualSum = (n*(n+1))/2;
        int sum = 0;
        for(int i = 0; i<arr.length-1; i++)
        {
            sum += arr[i];
        }

        return actualSum - sum;
    }
}
