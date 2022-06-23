package com.dsa.array;
// If element is greater than all the elements to its right side, then element is the leader.
public class Leader {
    public void printLeader(int [] arr)
    {
        int max = arr[arr.length-1];
        System.out.print(arr[arr.length-1] +" ");
        for(int i=arr.length-2 ; i>=0;i--)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                System.out.print(arr[i] +" ");
            }
        }
    }
}
