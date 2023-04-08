package com.topicwise.array.slidingWindow;

public class MaxSumOfKConsecutiveElements {

    public void maxSum(int [] arr, int k){
        int max_sum = 0, cur_sum = 0;
        for(int i = 0; i < k; i++){
            cur_sum += arr[i];
        }
        max_sum = cur_sum;
        for(int i = k ; i < arr.length; i++){
            cur_sum += (arr[i] - arr[i - k]);
            max_sum = Math.max(max_sum, cur_sum);
        }
        System.out.println("MaxSumOfKConsecutiveElements : "+ max_sum);
    }
}
