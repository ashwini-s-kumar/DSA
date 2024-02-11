package com.topicwise.mathematics.easy;

public class Factorial {
  // 4! = 1 * 2 * 3 * 4
  static int fact(int n){
    int res = 1;

    for(int i=2; i<=n; i++)
    {
      res = res * i;
    }
    return res;
  }
  public static void main(String [] arr){
    System.out.println("4 : "+ fact(4));
    System.out.println("2 : "+ fact(2));
  }
}
