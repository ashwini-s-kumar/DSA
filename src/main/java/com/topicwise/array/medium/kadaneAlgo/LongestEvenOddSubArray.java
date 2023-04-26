package com.topicwise.array.medium.kadaneAlgo;

import com.topicwise.array.PrintArray;
import com.topicwise.math.Arithmetics;

public class LongestEvenOddSubArray {
    public static int longestEvenOddSubArray(int [] arr)
    {
        int curlength = 1, maxLength = 1;
        for(int i = 1 ; i < arr.length; i++)
        {
            if( (arr[i-1]%2 == 0 && arr[i]%2 != 0)
                    || (arr[i-1]%2 != 0 && arr[i]%2 == 0))
            {
                curlength++;
            }
            else {
                maxLength = Arithmetics.max(curlength , maxLength);
                curlength = 1;
            }
        }
        return maxLength;
    }
    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" Longest Even Odd  of subArray in the given array : ");
        int [] arr7 = {1,2,3,1,4,5,6,7,8,8};
        PrintArray.print(arr7);
        System.out.print( " is : "+ longestEvenOddSubArray(arr7));

    }
}
