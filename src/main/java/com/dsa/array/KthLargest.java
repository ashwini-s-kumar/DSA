package com.dsa.array;

import java.util.Random;

public class KthLargest {
    void swap(int arr[], int l, int r){
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }

    int randomPartition(int arr[], int l, int r){
        int n = r-l+1;
        Random rd = new Random();
        int pivot = rd.nextInt(n);
        swap(arr, l + pivot, r);
        return partition(arr, l, r);
    }

    int kthLargest(int arr[], int l, int r, int k)
    {
        // If k is smaller than number of elements in array
        if (k > 0 && k <= r - l + 1)
        {
            // find a position for random partition
            int pos = randomPartition(arr, l, r);

            // if this pos gives the kth smallest element, then return
            if (pos-l == k-1)
                return arr[pos];

            // else recurse for the left and right half accordingly
            if (pos-l > k-1)
                return kthLargest(arr, l, pos-1, k);
            return kthLargest(arr, pos+1, r, k-pos+l-1);
        }

        return Integer.MAX_VALUE;
    }

    int partition(int arr[], int l, int r)
    {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++)
        {
            if (arr[j] >= x)
            {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }
}
