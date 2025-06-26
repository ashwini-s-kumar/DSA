package com.topicwise.recursionAndBacktracking.subSequencePattern;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
  // print all subste / subsequence with sum = n and size = k.
  // input number from 1 to 9.,  no array is given.

  public static void main(String [] arr){
    // preferred sum
    int pSum = 5;
    // preferred size
    int pSize = 2;
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ds = new ArrayList<>();
    findCombinationSum3(1, 0, 0 , ds, pSum, pSize, ans);
    System.out.println(ans);
  }

  private static void findCombinationSum3(int ind, int sum, int size, List<Integer> ds, int pSum, int pSize, List<List<Integer>> ans) {
    if(sum == pSum && size == pSize) {
      ans.add(new ArrayList<>(ds));
      return ;
    }
    if(sum > pSum || size > pSize || ind > 9) {
      return;
    }

    // pick
    ds.add(ind);
    findCombinationSum3(ind+1, sum + ind, size + 1, ds, pSum, pSize, ans);

    // not pick
    ds.remove(ds.size() - 1);
    findCombinationSum3(ind + 1, sum, size, ds, pSum, pSize, ans);
  }
}
