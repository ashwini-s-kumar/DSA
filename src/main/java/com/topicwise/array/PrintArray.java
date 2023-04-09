package com.topicwise.array;

public class PrintArray {
    public static void print(int [] arr)
    {
        for (int i:arr) {
            System.out.print(i + " ");
        }
    }
    public static void print(int [] arr, int lastIndex)
    {
        for (int i=0; i<=lastIndex; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
