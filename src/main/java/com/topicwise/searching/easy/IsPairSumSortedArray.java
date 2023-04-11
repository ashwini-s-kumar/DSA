package com.topicwise.searching.easy;

public class IsPairSumSortedArray {

    public static boolean isPair(int [] arr, int sum){
        int l = 0 , h = arr.length -1, curSum;
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
        System.out.println(isPair(array, 11));
        System.out.println(isPair(array, 7));
        System.out.println(isPair(array, 19));
    }
}
