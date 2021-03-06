package com.dsa.array;

public class LeftRotateArray {
    public void leftRotateByOne(int [] a)
    {
        int temp = a[0];
        for(int i=1; i<a.length ;i++)
        {
            a[i-1] = a[i];
        }
        a[a.length -1] = temp;
    }

    public void leftRotateByDPos(int [] arr, int d)
    {
        ReverseArrayTwoPointer rev = new ReverseArrayTwoPointer();
        rev.reverseArray(arr, 0 , d-1);
        rev.reverseArray(arr, d, arr.length - 1);
        rev.reverseArray(arr, 0, arr.length - 1);
    }
}
