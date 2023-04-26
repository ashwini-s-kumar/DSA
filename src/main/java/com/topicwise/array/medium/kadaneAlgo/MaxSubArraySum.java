package com.topicwise.array.medium.kadaneAlgo;

import com.topicwise.array.PrintArray;

public class MaxSubArraySum {
    public static int maxSubArraySum(int [] arr)
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
    public static void main(String [] arr){
        int [] arr6 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        PrintArray.print(arr6);
        System.out.print( " is : "+ maxSubArraySum(arr6));
    }

}
