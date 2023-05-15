package com.topicwise.string.medium;

import java.util.HashMap;

public class MinWindowWithCharsFromPattern {
    public static String smallestWindow(String s, String pattern) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int count = freqMap.size();
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) - 1);
                if (freqMap.get(c) == 0) {
                    count--;
                }
            }

            right++;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }

                char lc = s.charAt(left);
                if (freqMap.containsKey(lc)) {
                    freqMap.put(lc, freqMap.get(lc) + 1);
                    if (freqMap.get(lc) > 0) {
                        count++;
                    }
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minStart, minStart + minLen);
    }

    public static void main(String [] rr){
        System.out.println(smallestWindow("this is a test string", "tist"));
    }
}

