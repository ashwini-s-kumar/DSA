package com.topicwise.string.easy;

public class BinaryStrings {

    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(String str)
    {
        // Your code here

        int oneCount = 0;

        for(int i =0; i < str.length(); i++){
            if('1' == str.charAt(i)){
                oneCount +=1;
            }
        }

        int res = 0;

        for(int i = 1; i< oneCount; i++){
            res += oneCount - i;
        }

        return res;
    }

    public static void main(String [] arr){
        String str = "00100101";
        System.out.println(binarySubstring(str));
    }
}
/*
Given a binary string S. The task is to count the number of substrings that start and end with 1.
For example, if the input string is “00100101”,
then there are three substrings “1001”, “100101” and “101”.
 */