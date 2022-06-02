package com.dsa.array;

public class MoveNumberToEndOfArray {
    //Use same Array
    public static void moveAllInstancesToEnd(int [] array, int toMove)
    {
// Mark left pointer
        int i = 0;

        // Mark the right pointer
        int j = array.length - 1;

        // Iterate until left pointer
        // crosses the right pointer
        while (i < j)
        {
            while (i < j && array[j] == toMove)
                // Decrement right pointer => the toMove number is already in the end
                j--;

            if (array[i] == toMove)

                // Swap the two elements
                // in the array
                swap(array, i, j);
            // Increment left pointer
            i++;
        }
        PrintArray.print(array);
    }

    static int[] swap(int []arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
