package com.topicwise.recursion.subSequencePattern;

import java.util.ArrayList;
import java.util.List;

public class SubSet1 {
  public static void main(String [] arr){
    int a[]= {1,2,3};
    List<Integer> ans = new ArrayList<>();
    findSubSet1(0, a, ans, 0);
    System.out.println(ans);
  }

  private static void findSubSet1(int i, int[] a, List<Integer> ans, int sum) {
    if(i == a.length){
      ans.add(sum);
      return;
    }

    // pick
    findSubSet1(i+1, a, ans, sum+a[i]);

    // not pick
    findSubSet1(i+1, a, ans, sum);
  }
}
