package com.dsa.array;

public class MoveNegativeToEndOfArray {
    PrintArray printArray = new PrintArray();
    public void moveNegative(int [] arr)
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
        printArray.print(arr);
    }

}
