package com.topicwise.recursionAndBacktracking.subSequencePattern;


public class CheckSubsequencesWithSumK {
  // check if there is  any one subsequence with sum k

  public static void main(String [] arr){
    int a [] = {1, 4, 1};
    int sum = 2;
    boolean ans = findSubsequenceWithSumk(0, a,sum, 0);
    System.out.println(ans);
  }

  private static boolean findSubsequenceWithSumk(int i, int[] a,int sum, int s) {
    if(i == a.length) {
      if (s == sum) {
        return true;
      }
      return false;
    }
    // pick
    if(findSubsequenceWithSumk(i+1, a, sum, s+a[i])) {
      return true;
    }
    // Not pick
    if(findSubsequenceWithSumk(i+1, a,  sum, s)) {
      return true;
    }
    return false;
  }

}
