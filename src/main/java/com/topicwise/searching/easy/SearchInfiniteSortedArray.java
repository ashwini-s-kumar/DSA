package com.topicwise.searching.easy;

public class SearchInfiniteSortedArray {
    public static int search(int [] arr, int key){
        if(arr[0] == key){
            return 0;
        }
        int i = 1;
        while (key > arr[i]){
            i = i * 2;
        }
         if(key == arr[i]){
             return i;
         }
         return BinarySearch.recursiveBS(arr, (i/2 )+ 1, i -1, key);
    }
    public static void main(String [] arr){
        int [] array = new int [ 100];
        array[2] = 3;
        array[3] = 3;
        array[4] = 3;
        array[5] = 3;
        array[6] = 3;
        array[7] = 5;
        array[8] = 20;
        array[9] = 23;
        array[10] = 40;
        array[11] = 41;
        System.out.println(search(array, 20));
    }
}
