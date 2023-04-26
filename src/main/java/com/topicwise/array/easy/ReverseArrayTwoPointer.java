package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;

public class ReverseArrayTwoPointer {
    public static void reverseArray(int [] arr,int left, int right)
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
    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" Reverse of the  array : ");
        int [] arr1 = {100, 90, 80, 70, 60, 50, 40};
        PrintArray.print(arr1);
        System.out.print( " is : ");
        reverseArray(arr1, 0, arr1.length-1);
        PrintArray.print(arr1);
    }
}
