package com.topicwise.string.easy;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here

        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c >= 90 && c <= 122){
                set.add(c);
            }
        }

        return set.size() == 26;
    }

    public static void main(String  [] ar){

        System.out.println(checkPangram("Bawds jog, flick quartz, vex nymph"));
    }
}

/*
Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet
(either lowercase or uppercase or both). For example, we say the letter A is present in the string if either 'a' is present or 'A' is present.

Example 1:

Input:
S = Bawds jog, flick quartz, vex nymph
Output: 1
Explanation: In the given input, there
are all the letters of the English
alphabet. Hence, the output is 1.
 */