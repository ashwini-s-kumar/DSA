package com.topicwise.sorting;

public class BucketSort {

    public int [] sort(int [] arr)
    {
        int maxValue = maxValue(arr);
        return bucketSort(arr, maxValue);
    }

    int [] bucketSort(int [] arr, int maxValue)
    {
        int [] bucket = new int[maxValue + 1];
        int [] sortArr = new int [arr.length];

        for(int i = 0; i < arr.length; i++) {
            bucket[arr[i]] ++;
        }
        int pos = 0;
        for(int i = 0; i < bucket.length; i++)
        {
            for(int j = 0 ; j < bucket[i]; j++){
                sortArr[pos++] = i;
            }
        }

        return sortArr;
    }
    int maxValue(int [] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return  max;
    }
}
