package com.dsa.array;

public class PrintArray {
    public void print(int [] arr)
    {
        for (int i:arr) {
            System.out.print(i + " ");
        }
    }
    public void print(int [] arr, int n)
    {
        for (int i=0; i<n-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
