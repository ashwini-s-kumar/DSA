package com.topicwise.string.easy;

public class Anagram {
    // Two string container same characters in any order , same number of times.
    private static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int n = str1.length();
        int [] count = new int[256];
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for(int i = 0; i < n ; i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for(int i = 0; i < 256; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] arr){
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1,str2));
    }
}
