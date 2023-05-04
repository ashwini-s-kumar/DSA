package com.topicwise.array.leetcode.medium;

import com.topicwise.array.PrintArray;

public class FirstAndLastIndexSortedArray {
    public static int[] searchRange(int[] nums, int target) {

        int firstIndex = -1;
        int lastIndex = -1;

        int low = 0;
        int high = nums.length -1;
        int mid = 0;
        while(low <= high ){
            mid = (low + high) /2;
            if(nums[mid] == target){
                if(mid == 0 || nums[mid -1] != target){
                    firstIndex = mid;
                    break;
                }
                high = mid - 1;
            }
            else if(target > nums[mid]){
                low = mid +1;
            }else{
                high = mid - 1;
            }
        }

        low = 0;
        high = nums.length -1;
        mid = 0;
        while(low <= high){
            mid = (low + high) /2;
            if(nums[mid] == target){
                if(mid == nums.length -1 || nums[mid + 1] != target){
                    lastIndex = mid;
                    break;
                }
                low = mid + 1;
            }
            else if(target > nums[mid]){
                low = mid +1;
            }else{
                high = mid - 1;
            }
        }
        int [] res = {firstIndex, lastIndex};
        return res;
    }

    public static void main(String [] arr){
        int [] nums = {5,7,7,8,8,10};
        PrintArray.print(searchRange(nums, 8));
    }

}
