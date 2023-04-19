package com.topicwise.array;

public class PrintArray {
    public static void print(int [] arr)
    {
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void print(int [] arr, int lastIndex)
    {
        for (int i=0; i<=lastIndex; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void print(int [] arr,int startIndex, int lastIndex)
    {
        for (int i=startIndex; i<=lastIndex; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

}
