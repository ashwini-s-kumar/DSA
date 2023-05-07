package com.topicwise.string.easy;

public class CheckIfSubsequencePresent {
    public static boolean checkSubSequence(String str, String subSequence){
        int i = 0, j = 0;
        int n1 = str.length();
        int n2 = subSequence.length();

        while(i < n1 && j < n2){
            if(str.charAt(i) == subSequence.charAt(j)){
                i++;
                j++;
            }else {
                i++;
            }
        }
        if(j == subSequence.length()){
            return true;
        }
        return false;
    }

    public static void main(String [] arr){
        String str = "GEEKSFORGEEKS";
        String subSequence = "GRGES";
        boolean output = checkSubSequence(str, subSequence);
        System.out.println(output);
    }
}
