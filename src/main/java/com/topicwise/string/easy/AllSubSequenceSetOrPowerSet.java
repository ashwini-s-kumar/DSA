package com.topicwise.string.easy;

import java.util.ArrayList;
import java.util.List;

public class AllSubSequenceSetOrPowerSet {
    public static List<List<Character>> subSequence(String str) {
        List<List<Character>> output = new ArrayList<>();
        output.add(new ArrayList<>());

        char [] strChar = str.toCharArray();
        for(Character c : strChar){
            List<List<Character>> newSubSequences = new ArrayList<>();

            for(List<Character> subSequences : output){
                List<Character> sub = new ArrayList<>(subSequences);
                sub.add(c);
                newSubSequences.add(sub);
            }

            for(List<Character> subSequence  : newSubSequences){
                output.add(subSequence);
            }
        }

        return output;
    }

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
        List<List<Character>> output = subSequence("ABC");
        System.out.println(output);

        List<String> res = subSequenceRecur("ABC");
        System.out.println(res);
    }
}
