package com.topicwise.searching.easy;

public class Count1sBinaryArray {
    public static int count1s(int [] arr){
        int firstOccurance = FirstOccuranceSortedArray.firstOccurance(arr, 1);
        if(firstOccurance == -1){
            return -1;
        }
        return arr.length - firstOccurance;
    }
    public static void main(String [] arr){
        int [] array = {0,0,0,1,1,1,1,1,1,1};
        System.out.println(count1s(array));
    }
}
