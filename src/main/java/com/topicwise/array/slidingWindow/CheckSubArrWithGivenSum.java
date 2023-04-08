package com.topicwise.array.slidingWindow;

public class CheckSubArrWithGivenSum {
    //works only for non-negative array
    public void checkSubArrayExist(int [] arr, int sum){
        int cur_sum = arr[0],  start = 0;
        for (int i = 1; i <= arr.length; i++){
            while (cur_sum > sum){
                cur_sum -= arr[start];
                start++;
            }
            if(cur_sum == sum){
                System.out.println("Found the subArr with given sum from index "+ start + " to " + (i-1));
                return;
            }
            if(i < arr.length) {
                cur_sum += arr[i];
            }
        }
    }
}
