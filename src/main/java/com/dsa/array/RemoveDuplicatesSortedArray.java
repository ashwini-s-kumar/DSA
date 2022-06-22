package com.dsa.array;

public class RemoveDuplicatesSortedArray {
    public int  removeDuplicates( int [] arr)
    {
        int lastChecked = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr[lastChecked - 1])
            {
                arr[lastChecked] = arr[i];
                lastChecked++;
            }
        }
        return lastChecked+1;
    }
}
