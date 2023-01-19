package com.topicwise.sorting;

import com.topicwise.array.PrintArray;

public class Sort {
    /*    done ---> QuickSort - nlog(n)  - Divide&Conquer
          done ---> MergeSort - nlog(n)  - Divide&Conquer
          HeapSort - nlog(n)  - based on Binary Heap data structure. Similar to the selection sort.
          done ---> TreeSort - nlog(n)  - Binary Search & inorder traversal.
          done ---> ShellSort - nlog(n)  - variation of Insertion Sort
          done ---> InsertionSort - n
          done ---> BubbleSort -  n
          done ---> BucketSort - n+k
          done ---> SelectionSort - n^2

         Not done :
          TimSort - n  -    based on Insertion Sort and Merge Sort.
          CubeSort - n
          RadixSort - n*k
          CountingSort - n+k
     */

    public static void main(String [] arr)
    {
        PrintArray printArray = new PrintArray();
        int [] array1 = { 12, 11, 13, 5, 6, 7 };

        System.out.println("\n ==============QuickSort============\n");
        QuickSort quickSort =new QuickSort();
        quickSort.quickSort(array1, 0, array1.length - 1);
        printArray.print(array1);

        System.out.println("\n ==============MergeSort============\n");
        int [] array2 = { 12, 11, 13, 5, 6, 7 };
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array2, 0, array2.length -1);
        printArray.print(array2);

        System.out.println("\n =============InsertionSort=============\n");
        int [] array3 = { 12, 11, 13, 5, 6, 7 };
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array3);
        printArray.print(array3);


        System.out.println("\n =============TreeSort=============\n");
        int [] array4 = { 12, 11, 13, 5, 6, 7 };
        TreeSort treeSort = new TreeSort();
        treeSort.treeSort(array4);

        System.out.println("\n =============BucketSort=============\n");
        int [] array5 = {80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50};
        BucketSort bucketSort = new BucketSort();
        printArray.print(bucketSort.sort(array5));

        System.out.println("\n =============BubbleSort=============\n");
        int [] array6 = {80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array6);
        printArray.print(array6);

        System.out.println("\n =============SelectionSort=============\n");
        int [] array7 = {80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array7);
        printArray.print(array7);

        System.out.println("\n =============ShellSort=============\n");
        int [] array8 = {80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50};
        ShellSort shellSort = new ShellSort();
        shellSort.sort(array8);
        printArray.print(array8);

    }


}
