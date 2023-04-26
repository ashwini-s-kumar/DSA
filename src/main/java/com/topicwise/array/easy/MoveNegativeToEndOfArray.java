package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;

public class MoveNegativeToEndOfArray {

    public static void moveNegative(int [] arr)
    {
        int i = 0, j = arr.length-1;
        while(i<j)
        {
            while(i < j && arr[j] < 0)
                j--;
            if(arr[i] < 0)
                MoveNumberToEndOfArray.swap(arr, i, j);
            i++;
        }
        PrintArray.print(arr);
    }

    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" move negative numbers in the given array : ");
        int [] arr11 = { 1, -3, 4, -5 , -100, -8, 7, 10, -23, 18};
        PrintArray.print(arr11);
        System.out.print(" is : ");
        moveNegative(arr11);

    }

}
