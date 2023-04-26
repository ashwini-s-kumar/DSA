package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;

public class LeftRotateArray {
    public static void leftRotateByOne(int [] a)
    {
        int temp = a[0];
        for(int i=1; i<a.length ;i++)
        {
            a[i-1] = a[i];
        }
        a[a.length -1] = temp;
    }

    public  static void leftRotateByDPos(int [] arr, int d)
    {
        ReverseArrayTwoPointer rev = new ReverseArrayTwoPointer();
        rev.reverseArray(arr, 0 , d-1);// 0 - (d-1)
        rev.reverseArray(arr, d, arr.length - 1);  // d - (n-1)
        rev.reverseArray(arr, 0, arr.length - 1); // 0 - (n-1)
    }

    public static void rightRotateByDPos(int [] arr, int d)
    {
        ReverseArrayTwoPointer rev = new ReverseArrayTwoPointer();
        rev.reverseArray(arr, 0, arr.length - 1); // 0 - (n-1)
        rev.reverseArray(arr, 0 , d-1); // 0 - (d-1)
        rev.reverseArray(arr, d, arr.length - 1); // d - (n-1)
    }

    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" Reverse of the  array : ");
        int [] arr1 = {100, 90, 80, 70, 60, 50, 40};

        System.out.println(" ");
        System.out.print(" Left Rotate by 1 position of the  array : ");
        PrintArray.print(arr1);
        System.out.print( " is : ");
        leftRotateByOne(arr1);
        PrintArray.print(arr1);

        System.out.println(" ");
        System.out.print(" Left Rotate by d position of the  array : ");
        PrintArray.print(arr1);
        System.out.print( " is : ");
        leftRotateByDPos(arr1, 3);
        PrintArray.print(arr1);

        System.out.println(" ");
        System.out.print(" Right Rotate by d position of the  array : ");
        PrintArray.print(arr1);
        System.out.print( " is : ");
        rightRotateByDPos(arr1, 3);
        PrintArray.print(arr1);
    }
}
