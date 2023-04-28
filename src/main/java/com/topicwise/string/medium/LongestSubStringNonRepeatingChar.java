package com.topicwise.string.medium;

import java.util.HashSet;

public class LongestSubStringNonRepeatingChar {
    public static int longestSubString(String s){
        if (s.length() == 0) {
            return 0;
        }
        HashSet<Character> st = new HashSet<Character>();
        st.add(s.charAt(0));

        int n = s.length();
        int i = 1;
        int len = 1;
        int maxLen = 0;
        while (i < n) {
            if (s.charAt(i) != s.charAt(i - 1)
                    && !st.contains(s.charAt(i))) {
                st.add(s.charAt(i));
                len++;
                i++;
                if (len > maxLen) {
                    maxLen = len;
                }
            }
            else {
                st.clear();
                i = i - len + 1;
                len = 0;
            }
        }
        return Math.max(maxLen, len);

    }

    public static void main(String[] args)
    {
        String str = "abcabcbb";
        System.out.println("The input string is " + str);
        int len = longestSubString(str);
        System.out.println(
                "The length of the longest non-repeating character substring "
                        + len);
    }
}
