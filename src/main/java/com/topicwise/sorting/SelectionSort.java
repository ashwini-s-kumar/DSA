package com.topicwise.sorting;

public class SelectionSort {
    void sort(int [] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            int minIndex = i;
            for(int j = i+1 ; j < arr.length ; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
