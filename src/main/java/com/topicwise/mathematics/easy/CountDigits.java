package com.topicwise.mathematics.easy;

public class CountDigits {

  static int count(int number){
    int digits = 0;
    while(number > 0){
      digits ++;
      number = number / 10;
    }
    return digits;
  }

  public static void main(String [] arr){
    System.out.println("12345 : "+ count(12345));
    System.out.println("123 : "+ count(123));
  }
}
