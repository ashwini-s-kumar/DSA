package com.topicwise.mathematics.easy;

public class Palindrome {
  static boolean palindrome(int number){
    int copyNum = number;
    if(number < 10){
      return true;
    }

    int rev = 0;
    while(number > 0){
      int rem = number % 10;
      number = number /10;
      rev = rev * 10 + rem;
    }

    if(rev == copyNum){
      return true;
    }
    return false;
  }
  public static void main(String [] arr){
    System.out.println("12345 : "+ palindrome(12345));
    System.out.println("1221 : "+ palindrome(1221));
  }
}
