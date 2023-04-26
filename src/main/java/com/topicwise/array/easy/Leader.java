package com.topicwise.array.easy;
// If element is greater than all the elements to its right side, then element is the leader.
public class Leader {
    public static void printLeader(int [] arr)
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
    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" Leaders of  the given array : ");
        int [] arr4 = {30, 2000, 70, 1000, 90, 500, 420,40};
        printLeader(arr4);
    }
}
