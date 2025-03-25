package com.topicwise.recursion.subSequencePattern;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesWithSumK {

  public static void main(String [] arr){
    int a [] = {1, 2, 1};
    int sum = 2;
    List<Integer> ds = new ArrayList();
    List<List<Integer>> ans = new ArrayList<>();
    findSubsequenceWithSumk(0, a, ds, ans, sum, 0);
    System.out.println(ans);
  }

  private static void findSubsequenceWithSumk(int i, int[] a, List<Integer> ds, List<List<Integer>> ans, int sum, int s) {

    if(i == a.length) {
      if (s == sum) {
        ans.add(new ArrayList<>(ds));
      }
      return;
    }
    // pick
    ds.add(a[i]);
    findSubsequenceWithSumk(i+1, a, ds,ans, sum, s+a[i]);

    // Not pick
    ds.remove(ds.size() - 1);
    findSubsequenceWithSumk(i+1, a, ds, ans, sum, s);
  }
}
