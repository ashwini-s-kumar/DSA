package com.topicwise.string.easy;

public class LeftMostNonRepeating {
    private static int nonRepeating(String str){
        int [] count = new int[256];
        int res = -1;
        for(int i= 0; i < str.length(); i++){
            count[str.charAt(i)] ++;
        }
        for(int i= 0; i< str.length(); i++){
            int index = str.charAt(i);
            if(count[index] == 1){
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String [] arr){
        String str = "abbcda";
        System.out.println(nonRepeating(str));
    }
}
