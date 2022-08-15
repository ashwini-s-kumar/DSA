package com.interview.array;

import java.util.Arrays;
import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long sum = 0;
        for(int i = 0; i< arr.size(); i++)
        {
            sum += arr.get(i);
        }
        long max = sum - arr.get(0), min = sum - arr.get(0);
        long curSum = 0;
        for(int i = 1; i< arr.size(); i++)
        {
            curSum = sum - arr.get(i);
            if(max < curSum)
                max = curSum;
            if(min > curSum)
                min = curSum;
        }
        System.out.println(min +" "+max);
        //System.out.println(max);
    }

    public static void main(String [] arr)
    {
        Integer [] array = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(array);
        MinMaxSum.miniMaxSum(list);
    }
}
