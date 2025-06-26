package com.topicwise.recursionAndBacktracking.subSequencePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
  public static void main(String [] ar){
    int [] input = {1,2,2};
    Arrays.sort(input);
    List<Integer> ds = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    subSet2(0, input, ds, ans);
    System.out.println(ans);
    System.out.println(ans.size());

  }

  private static void subSet2(int ind, int[] input, List<Integer> ds, List<List<Integer>> ans) {
    ans.add(new ArrayList<>(ds));
    for(int i = ind; i < input.length; i++){
      if(i != ind && input[i] == input[i-1])
      {
        continue;
      }
      ds.add(input[i]);
      subSet2(i+1, input, ds, ans);
      ds.remove(ds.size()-1);
    }
  }
}
