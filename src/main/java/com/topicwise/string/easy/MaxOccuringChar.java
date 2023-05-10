package com.topicwise.string.easy;

import java.util.Arrays;

public class MaxOccuringChar {
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int [] count = new int[256];
        Arrays.fill(count, 0);

        for(int i = 0; i < line.length() ; i ++){
            count[line.charAt(i)] ++;
        }

        int max = Integer.MIN_VALUE;
        int asciiChar = -1;

        for(int i = 0; i < 256; i++){
            if(count[i] > max){
                max = count[i]; //
                asciiChar = i;
            }
            else if(count[i] == max){
                if(i < asciiChar){
                    max = count[i];
                    asciiChar = i;
                }
            }
        }
        return (char)asciiChar;
    }

    public static void main(String [] arr){
        System.out.println(getMaxOccuringChar("testsample"));
        System.out.println(getMaxOccuringChar("output"));
    }
}


/*
Given a string str. The task is to find the maximum occurring character in the string str.
If more than one character occurs the maximum number of time then print the lexicographically smaller character.

Example 1:

Input:
str = testsample
Output: e
Explanation: e is the character which
is having the highest frequency.
Example 2:

Input:
str = output
Output: t
Explanation:  t and u are the characters
with the same frequency, but t is
lexicographically smaller.
 */