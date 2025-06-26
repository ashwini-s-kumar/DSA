package com.topicwise.recursionAndBacktracking.Hard;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
  public static void main(String [] arr) {
    String s = "aabb";
    List<List<String>> ans = new ArrayList<>();
    List<String> ds = new ArrayList<>();
    findPalindromePartitioning(s, 0, ds, ans);
    System.out.println(ans);
  }

  private static void findPalindromePartitioning(String s, int ind, List<String> ds, List<List<String>> ans) {
    if(ind == s.length()) {
      ans.add(new ArrayList<>(ds));
      return;
    }
    for(int i = ind; i < s.length(); i++) {
      if(isPalindrome(s,ind, i)) {
        ds.add(s.substring(ind, i+1));
        findPalindromePartitioning(s, i+1, ds, ans);
        ds.remove(ds.size() - 1);
      }
    }
  }

  private static boolean isPalindrome(String s, int i , int j) {
    while(i<=j) {
      if(s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
