package com.dsa.array;

public class SecondLargestNumber {
    public int secondLargest(int [] arr)
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
}
