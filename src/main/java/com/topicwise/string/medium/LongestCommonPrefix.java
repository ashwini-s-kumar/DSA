package com.topicwise.string.medium;

public class LongestCommonPrefix {
    /*
        Input 1:["abcdefgh", "aefghijk", "abcefgh"]
        o/p : "a"

        Input 2:["abab", "ab", "abcd"];
        o/p : "ab"
     */
    public static String commonPrefix(String [] strArr)
    {
        String res = "";
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < strArr.length; i++)
        {
            min = Math.min(min, strArr[i].length());
        }

        for(int i = 0; i < min ; i++)
        {
            char c = strArr[0].charAt(i);
            for(int j = 1; j < strArr.length; j++)
            {
                if(c != strArr[j].charAt(i))
                {
                    return res;
                }
            }
            res += c;
        }
        return  res;
    }

    public static void main(String [] arr)
    {
        String [] strArr = new String[3];
        strArr[0] = "abcdefgh";
        strArr[1] = "aefghijk";
        strArr[2] = "abcefgh";
        System.out.println("The longest common prefix : " + commonPrefix(strArr));
    }
}
