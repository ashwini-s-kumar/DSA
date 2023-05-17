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
    public static void moveNegativeWithInsertionOrder(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = 0;

        while (right < n) {
            if (arr[right] >= 0) {
                // Swap the positive number with the left pointer
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }

    public static void main(String [] arr){
        System.out.println(" ");
        System.out.print(" move negative numbers in the given array : ");
        int [] arr11 = { 1, -3, 4, -5 , -100, -8, 7, 10, -23, 18};
        PrintArray.print(arr11);
        System.out.print(" is : ");
        moveNegative(arr11);

        System.out.println(" ");
        System.out.print(" move negative numbers in the given array with insertion order : ");
        int [] arr12 = { 1, -3, 4, -5 , -100, -8, 7, 10, -23, 18};
        PrintArray.print(arr12);
        System.out.print(" is : ");
        moveNegativeWithInsertionOrder(arr12);
        PrintArray.print(arr12);


        /*
        i  = 0,
                { 1, -3, 4, -5 , -100, -8, 7, 10, -23, 18};
                l = 1, r =  1;
        i = 1
                { 1, -3,  4, -5 , -100, -8, 7, 10, -23, 18};
                l = 1, r = 2
        i - 2
                { 1, 4,  -3, -5 , -100, -8, 7, 10, -23, 18};
                l  = 2, r = 3
        i = 3
                { 1, 4,  -3, -5 , -100, -8, 7, 10, -23, 18};
                l = 2, r = 4
        i = 4
                { 1, 4,  -3, -5 , -100, -8, 7, 10, -23, 18};
                l = 2, r = 5
        i = 5
                { 1, 4,  -3, -5 , -100, -8, 7, 10, -23, 18};
                l = 2, r = 6
        i = 6
                { 1, 4,  -3, -5 , -100, -8, 7, 10, -23, 18};

         */
    }

}
