package com.topicwise.searching.easy;

public class CountOccuranceSortedArray {
    public static int countOccurance(int [] arr, int key){
        int firstOccurance = FirstOccuranceSortedArray.firstOccurance(arr, key);
        if(firstOccurance == -1){
            return  -1;
        }
        int lastOccurance = LastOccuranceSortedArray.lastOccurance(arr, key);
        return lastOccurance - firstOccurance + 1;
    }

    public static void main(String [] arr){
        int [] array = {3,4,5,6,6,6,10,22,23,23,24};
        System.out.println(countOccurance(array, 6));
        System.out.println(countOccurance(array, 11));
        System.out.println(countOccurance(array, 23));
        System.out.println(countOccurance(array, 5));
    }
}
