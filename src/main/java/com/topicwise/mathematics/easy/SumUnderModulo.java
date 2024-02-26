package com.topicwise.mathematics.easy;

public class SumUnderModulo {
  public static long sumUnderModulo(long a, long b){
    int M=1000000007;
    // sum modulo with M
    return (a%M + b%M)%M;
  }
  public static void main(String [] arr){
    long a = Long.parseLong("9223372036854775807");
    long b = Long.parseLong("9223372036854775807");
    System.out.println(sumUnderModulo(a, b));
  }
}
