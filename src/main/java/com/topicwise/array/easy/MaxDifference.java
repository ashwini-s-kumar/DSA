package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;
import com.topicwise.mathematics.Arithmetics;

public class MaxDifference {
    public static int maxDiff(int [] arr)
    {
        int maxDiff = arr[1]-arr[0], min = arr[0];
         for(int i=1; i< arr.length; i++)
         {
             maxDiff = Arithmetics.max(maxDiff, arr[i] - min);
             min = Arithmetics.min(min, arr[i]);
         }
        return maxDiff;
    }

    public static int simpleMaxDiff(int [] arr){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(min > arr[i]){
                min =arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max - min;
    }

    public static void main(String [] arr){
        int [] arr4 = {30, 2000, 70, 1000, 90, 500, 420,40};

        System.out.println(" ");
        System.out.print(" MaxDifference in  of   given array : ");
        PrintArray.print(arr4);
        System.out.print( " is : "+ maxDiff(arr4));
        System.out.print( " is : "+ simpleMaxDiff(arr4));
    }

}
