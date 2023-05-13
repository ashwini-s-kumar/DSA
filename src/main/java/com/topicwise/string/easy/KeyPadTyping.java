package com.topicwise.string.easy;

public class KeyPadTyping {
    public static String printNumber(String s)
    {
        //Your code here

        String res = "";

        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'b' || c == 'c'){
                res = res + 2;
            }else if(c == 'd' || c == 'e' || c == 'f'){
                res = res + 3;
            }else if(c == 'g' || c == 'h' || c == 'i'){
                res = res + 4;
            }else if(c == 'j' || c == 'k' || c == 'l'){
                res = res + 5;
            }else if(c == 'm' || c == 'n' || c == 'o'){
                res = res + 6;
            }else if(c == 'p' || c == 'q' || c == 'r' || c == 's'){
                res = res + 7;
            }else if(c == 't' || c == 'u' || c == 'v'){
                res = res + 8;
            }else{
                res = res + 9;
            }
        }

        return res;
    }
    public static void main(String [] arr){
        System.out.println(printNumber("geeksforgeeks"));
    }
}
/*
S = geeksforgeeks
Output: 4335736743357
Explanation:geeksforgeeks is 4335736743357
in decimal when we type it using the given
keypad
 */