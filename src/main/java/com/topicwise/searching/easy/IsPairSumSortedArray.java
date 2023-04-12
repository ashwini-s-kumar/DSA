package com.topicwise.searching.easy;

public class IsPairSumSortedArray {

    public static boolean isPair(int [] arr, int sum, int startIndex, int n){
        int l = startIndex , h = n-1, curSum;
        while(l <= h){
            curSum = arr[l] + arr[h];
            if(curSum == sum){
                return true;
            }else if(curSum > sum){
                h --;
            }
            else{
                l ++;
            }
        }
        return false;
    }

    public static void main(String [] arr){
        int [] array = {2,3,4,5,6};
        System.out.println(isPair(array, 11, 0, 5));
        System.out.println(isPair(array, 7, 0, 5));
        System.out.println(isPair(array, 19, 0 , 5));
    }
}
