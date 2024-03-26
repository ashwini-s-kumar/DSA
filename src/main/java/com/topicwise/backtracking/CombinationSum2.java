package com.topicwise.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    /*
  Time complexity :  O( 2^N * k), n elements will produce 2^n combination.
    K is the time taken to add each combination in result list(k = average length).
  Space complexity : k * x, k = average length of each combinations, x = no of combinations
   */

  public static void main(String [] arr){
    int nums [] = {1,2,1,2,1};
    Arrays.sort(nums);
    int target = 4;
    List<List<Integer>> combinations = new ArrayList<>();
    List<Integer> com = new ArrayList<>();
    findCombinations(0, nums, target, com, combinations);
    System.out.println(combinations);
  }

  private static void findCombinations(int index, int[] nums, int target, List<Integer> com, List<List<Integer>> combinations) {
    if(target == 0){
      combinations.add(new ArrayList<>(com));
      return;
    }
    for(int i = index; i < nums.length; i++){
      if(i != index && nums[i] == nums[i-1]) {
        continue;
      }
      if(nums[i] > target){
        break;
      }
      com.add(nums[i]);
      findCombinations(i + 1, nums, target - nums[i], com, combinations);
      com.remove(com.size() - 1);
    }
  }
}
