package com.topicwise.string.easy;

public class FirstOccuranceOfSubStrInStr {
    //Function to locate the occurrence of the string x in the string s.
    static int strstr(String s, String x)
    {
        // Your code here
        int n = s.length();
        int m = x.length();
        int res = -1;
        if(m > n){
            return res;
        }

        for(int i = 0; i <= n-m; i++){
            int j;
            for(j = 0; j < m; j++){
                if(s.charAt(i+j) != x.charAt(j)){
                    break;
                }
            }
            if(j == m){
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String [] arr){
        System.out.println(strstr("GeeksForGeeks", "Fr"));
        System.out.println(strstr("GeeksForGeeks", "For"));
    }
}
