package com.topicwise.array.medium.kadaneAlgo;

import com.topicwise.array.PrintArray;
import com.topicwise.mathematics.Arithmetics;

public class MaxCircularSumSubArray {
    public static int maxCircularSumSubArray(int [] arr)
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
        int maxInverseArray = maxSubArraySum.maxSubArraySum(arr);
        if(maxInverseArray + sum == 0)
            return maxNormalArray;
        else
            return Arithmetics.max(maxNormalArray, maxInverseArray + sum);
    }
    public static void main(String [] arr){
        int [] arr6 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        PrintArray.print(arr6);
        System.out.print( " is : "+ maxCircularSumSubArray(arr6));



        System.out.println(" ");
        System.out.print(" Max Sum of Circular subArray in the given array : ");
        PrintArray.print(arr6);
        System.out.print( " is : "+ maxCircularSumSubArray(arr6));

    }
}