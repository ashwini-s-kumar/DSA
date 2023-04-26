package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;

public class RemoveDuplicatesSortedArray {
    public static int  removeDuplicates( int [] arr)
    {
        int sortedIndex = 0;
        for(int i=1; i<=arr.length-1; i++){
            if(arr[i] != arr[sortedIndex])
            {
                sortedIndex += 1;
                arr[sortedIndex] = arr[i];
            }
        }
        return sortedIndex;
    }
    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" Remove Duplicates of the sorted array : ");
        int [] arr2 = {12, 17, 17, 23, 27, 35, 35, 46, 50, 60, 70, 70};
        PrintArray.print(arr2);
        System.out.print( " is : ");
        int lastIndex = removeDuplicates(arr2);
        PrintArray.print(arr2,lastIndex);
    }
}
