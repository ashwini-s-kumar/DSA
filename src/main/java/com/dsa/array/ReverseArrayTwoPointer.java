package com.dsa.array;

public class ReverseArrayTwoPointer {
    public void reverseArray(int [] arr,int left, int right)
    {
        int temp = 0;
        while(left < right)
        {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
    }
}
