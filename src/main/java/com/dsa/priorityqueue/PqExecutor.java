package com.dsa.priorityqueue;

import com.dsa.array.PrintArray;

public class PqExecutor {
    public static void main(String [] arr)
    {
        PrintArray printArray = new PrintArray();
        KthSmallestLargestInArray minMax = new KthSmallestLargestInArray();

        int [] arr1 = { 1, 3, 4, 5 , 100, 8, 7, 10, 23, 18};
        int k = 3;

        System.out.println(" ");
        System.out.print(" The " + k+"th move smallest no. in the given array : ");
        printArray.print(arr1);
        minMax.kthMin(arr1,k);

        System.out.println(" ");
        System.out.print(" The " + k+"th move largest no. in the given array : ");
        printArray.print(arr1);
        minMax.kthMax(arr1,k);
    }
}
