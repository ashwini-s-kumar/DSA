package com.topicwise.backtracking;

import java.util.ArrayList;
import java.util.List;

public class AllPermutations {
  private static void computeAllPermutations(int index, int length, int[] a, List<List<Integer>> ans) {
    if(index == length){
      List<Integer> permutation = new ArrayList<>();
      for(int i = 0; i < length; i++){
        permutation.add(a[i]);
      }
      ans.add(permutation);
      return;
    }
    for(int i = index; i < length; i++){
      swap(index, i, a);
      computeAllPermutations(index + 1, length, a, ans);
      swap(index, i, a);
    }
  }

  public static void main(String [] arr){
    int [] a = {1, 2, 3};
    List<List<Integer>> ans = new ArrayList<>();
    computeAllPermutations(0, a.length, a, ans);
    System.out.println(ans);
  }

  static void swap(int i , int j, int [] a){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

}
