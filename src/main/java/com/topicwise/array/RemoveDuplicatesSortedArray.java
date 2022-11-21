package com.topicwise.array;

public class RemoveDuplicatesSortedArray {
    public int  removeDuplicates( int [] arr)
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
}
