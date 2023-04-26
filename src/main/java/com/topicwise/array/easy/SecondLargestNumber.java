package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;

public class SecondLargestNumber {
    public static int secondLargest(int [] arr)
    {
        int lar=Integer.MIN_VALUE, secLar=Integer.MIN_VALUE;
        if(arr.length < 2) {
            System.out.print("The array doesn't have 2 elements .");
            return 0;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > lar )
            {
                secLar = lar;
                lar = arr[i];
            }
            else if(arr[i] > secLar && arr[i] != lar)
            {
                secLar = arr[i];
            }
        }
        return secLar;
    }

    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" Second Largest in the given array : ");
        int [] arr3 = {30, 50, 70, 20, 90, 500, 420,40};
        PrintArray.print(arr3);
        System.out.print( " is : " + secondLargest(arr3));

    }
}
