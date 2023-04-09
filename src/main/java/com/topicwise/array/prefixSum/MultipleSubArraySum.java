package com.topicwise.array.prefixSum;

public class MultipleSubArraySum {
    private static int [] prefixSum;
    private static void buildPrefixSum(int [] arr){
        prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixSum[i]= prefixSum[i-1] + arr[i];
        }
    }

    private static int getSum(int l, int r){
        if(l == 0){
            return prefixSum[r];
        }else{
            return  prefixSum[r] - prefixSum[l-1];
        }
    }

    public static void main(String [] arr){
        int [] a = {2,8,3,9,6,5,4};
        buildPrefixSum(a);
        System.out.println(getSum(0,2));
        System.out.println(getSum(1,3));
    }
}
