package com.topicwise.recursion.easy;

import java.util.ArrayList;
import java.util.List;

public class PowerSetOfString {
    private static List<String> subSequenceRecur(String str){
        int curIndex = 0;
        String cur = " ";
        List<String> res = new ArrayList<>();
        powerSet(str, res, curIndex, cur);
        return  res;
    }

    private static void powerSet(String str, List<String> res, int curIndex, String cur){
        if(curIndex == str.length()){
            res.add(cur);
            return;
        }
        powerSet(str, res, curIndex+1, cur);
        powerSet(str, res, curIndex+1, cur+str.charAt(curIndex));
    }

    public static void main(String [] ar){

        List<String> res = subSequenceRecur("ABC");
        System.out.println(res);
    }
}
