package com.topicwise.searching.easy;

public class TripletSumSortedArray {
    public static boolean isTriplet(int [] arr, int sum, int s, int n){
        for(int i = 0; i <= n-3; i++){
            return IsPairSumSortedArray.isPair(arr, sum -arr[i], i+1, n);
        }
        return  false;
    }

    public static void main(String [] arr){
        int [] array = {2, 3, 5, 6, 15};
        System.out.println(isTriplet(array, 20, 0 , 5));
    }
}
