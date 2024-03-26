package com.topicwise.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
  /*
  Time complexity :  O( 2^N * k), n elements will produce 2^n combination.
    K is the time taken to add each combination in result list(k = average length).
  Space complexity : k * x, k = average length of each combinations, x = no of combinations
   */

  public static void main(String [] arr){
    int nums [] = {2,3,6,7};
    int target = 7;
    List<List<Integer>> combinations = new ArrayList<>();
    List<Integer> com = new ArrayList<>();
    findCombinations(0, nums, target, com, combinations);
    System.out.println(combinations);
  }

  private static void findCombinations(int index, int[] nums, int target, List<Integer> com, List<List<Integer>> combinations) {
    if(index == nums.length){
      if(target == 0){
        combinations.add(new ArrayList<>(com));
      }
      return;
    }

    if(nums[index] <= target) {
      com.add(nums[index]);
      findCombinations(index, nums, target - nums[index], com, combinations);
      com.remove(com.size() - 1);
    }
    findCombinations(index + 1, nums, target, com, combinations);
  }
}
