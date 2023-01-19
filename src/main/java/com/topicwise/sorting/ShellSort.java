package com.topicwise.sorting;

public class ShellSort {

    void sort(int [] arr)
    {
        int n = arr.length;
        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int key = arr[i];
                int j;

                for (j = i; j >= gap && arr[j - gap] > key; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = key;
            }
        }
    }
}
