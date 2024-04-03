package com.topicwise.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PowerSetOrSubset1 {
    private static List<List<Integer>> subSequenceRecur(int [] input){
        int curIndex = 0;
        List<Integer> curSubset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        powerSet(input, res, curIndex, curSubset);
        return  res;
    }

    private static void powerSet(int [] input, List<List<Integer>> res, int curIndex, List<Integer> curSubset){
        if(curIndex == input.length){
            res.add(new ArrayList<>(curSubset));
            return;
        }
        // pick
        curSubset.add(input[curIndex]);
        powerSet(input, res, curIndex+1, curSubset);
        // back track and removed the picked element
        curSubset.remove(curSubset.size()-1);

        // not pick
        powerSet(input, res, curIndex+1, curSubset);
    }

    public static void main(String [] ar){
       int [] input = {1,2,3};
        List<List<Integer>> res = subSequenceRecur(input);
        System.out.println(res);
    }
}
