package com.topicwise.mathematics.easy;

public class CheckPrime {
  /*
  Time Complexity: O(sqrt(n))

  Auxiliary space: O(1)
   */
  public static boolean isPrime(int n){
    if(n <= 1){
      return false;
    }
    for(int i = 2; i*i <= n; i++){
      if( n % i == 0){
        return false;
      }
    }
    return true;
  }
  public static void main(String [] arr){
    System.out.println("11 "+ isPrime(11));
    System.out.println("10 "+ isPrime(10));
  }
}
