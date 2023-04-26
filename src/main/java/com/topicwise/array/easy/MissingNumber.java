package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;

public class MissingNumber {
    public static int missingNumber(int [] arr)
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

    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" MIssing number in the given array : ");
        int [] arr10 = { 1, 3, 4, 5};
        PrintArray.print(arr10);
        System.out.print(" is : ");
        System.out.print(missingNumber(arr10));
    }
}
