package com.topicwise.array.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SubSetsInUniqueArray {

    // Time : O(n * 2^n)
    // Space : O(n * 2^n)
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList();
            for (List<Integer> curr : output) {

                List<Integer> subSet = new ArrayList<>(curr);
                subSet.add(num);

                newSubsets.add(subSet);
            }
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        return output;
    }

    // TODO : BackTracking

    public static void main(String [] arr){
        int [] nums = {1,2,3,};
        List<List<Integer>> res = subsets(nums);
        System.out.println(res);
    }
}
