package com.topicwise.string.easy;

import java.util.ArrayList;
import java.util.List;

public class AllSubSequence {
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

    public static void main(String [] ar){
        String str = "ABC";
        List<List<Character>> output = subSequence(str);
        System.out.println(output);
    }
}
