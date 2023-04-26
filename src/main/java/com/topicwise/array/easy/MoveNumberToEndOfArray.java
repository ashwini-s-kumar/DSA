package com.topicwise.array.easy;

import com.topicwise.array.PrintArray;

public class MoveNumberToEndOfArray {
    //Use same Array
    public static void moveAllInstancesToEnd(int [] array, int toMove)
    {
        PrintArray printArray = new PrintArray();
        // Mark left , right pointer
        int i = 0, j = array.length - 1;

        // Iterate until left pointer
        // crosses the right pointer
        while (i < j)
        {
            while (i < j && array[j] == toMove) {
                // Decrement right pointer => the toMove number is already in the end
                j--;
            }
            if (array[i] == toMove) {
                // Swap the two elements
                // in the array
                swap(array, i, j);
            }
            // Increment left pointer
            i++;
        }

        printArray.print(array);
    }

    static void swap(int []arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String [] arr){
        int [] moveNumber = {2, 1, 2, 2, 2, 3, 4, 2};
        int toMove = 2;
        System.out.println("The given array is " );
        PrintArray.print(moveNumber);
        System.out.println(" , toMove = "+toMove+ ", array after moving "+ toMove);
        moveAllInstancesToEnd(moveNumber, toMove);

    }
}
