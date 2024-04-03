package com.topicwise.backtracking;

import com.topicwise.recursion.easy.Factorial;

import java.util.ArrayList;
import java.util.List;
/*
we are picking n numbers = O(N)
Ant remove or erase operation ins O(N)
So , Time = O(N) * O(N) = N(N ^ 2)
space = O(N) to store the list.
 */
public class KthPermutationSequence {
  public static void main(String [] arr){
    List<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    int k = 17;
    String sequence = findSequence(nums, k);
    System.out.println(sequence);
  }

  private static String findSequence(List<Integer> nums, int k) {
    String seq = "";
    int noOfSubPermutation = Factorial.factorial(nums.size()-1);
    k = k - 1;
    while(true) {
      int index = k / noOfSubPermutation;
      seq += nums.get(index);
      nums.remove(index);
      if (nums.size() == 0) {
        break;
      }
      k = k % noOfSubPermutation;
      noOfSubPermutation = noOfSubPermutation / nums.size();
    }
    return seq;
  }


}
