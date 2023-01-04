package com.topicwise.sorting;

import com.topicwise.array.PrintArray;

public class Sort {
    /*QuickSort - nlog(n)  - Divide&Conquer
      MergeSort - nlog(n)  - Divide&Conquer
      HeapSort - nlog(n)  - based on Binary Heap data structure. Similar to the selection sort.
      TreeSort - nlog(n)
      ShellSort - nlog(n)
      InsertionSort - n
      TimSort - n  -    based on Insertion Sort and Merge Sort.
      BubbleSort -  n
      CubeSort - n
      BucketSort - n+k
      RadixSort - n*k
      CountingSort - n+k
      SelectionSort - n^2
     */

    public static void main(String [] arr)
    {
        PrintArray printArray = new PrintArray();
        int [] array1 = { 12, 11, 13, 5, 6, 7 };

        QuickSort quickSort =new QuickSort();
        quickSort.quickSort(array1, 0, array1.length - 1);
        printArray.print(array1);
        System.out.println("\n ==========================");

        int [] array2 = { 12, 11, 13, 5, 6, 7 };
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array2, 0, array2.length -1);
        printArray.print(array2);
        System.out.println("\n ==========================");

        int [] array3 = { 12, 11, 13, 5, 6, 7 };
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array3);
        printArray.print(array3);
        System.out.println("\n ==========================");

    }


}
